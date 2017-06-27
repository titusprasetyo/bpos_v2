package com.busoftinc.pos.autosync;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.possync.DataLogicIntegration;
import com.openbravo.possync.ExternalSalesHelper;
import com.openbravo.possync.OrdersSync;
import com.openbravo.possync.ProductsSync;

public class SyncProduct implements Runnable {

	private static final Logger logger = Logger.getLogger(SyncProduct.class
			.getName());
	private AppView theApp;
	private ExternalSalesHelper externalsales;

	public SyncProduct(AppView app) {
		this.theApp = app;
	}

	@Override
	public void run() {
		DataLogicSystem dlSystem = (DataLogicSystem) theApp
				.getBean("com.openbravo.pos.forms.DataLogicSystem");
		DataLogicIntegration dli = (DataLogicIntegration) theApp
				.getBean("com.openbravo.possync.DataLogicIntegration");
		DataLogicSales dlsales = (DataLogicSales) theApp
				.getBean("com.openbravo.pos.forms.DataLogicSales");
		ProductsSync prods = new ProductsSync(dlSystem, dli, dlsales,
				theApp.getInventoryLocation());
		OrdersSync orders = new OrdersSync(dlSystem, dli);
		try {
			externalsales = new ExternalSalesHelper(dlSystem);
			int intervals = Integer.parseInt(externalsales.getAutoSync());
			while (true) {
				if (intervals > 0) {
					logger.log(Level.INFO, "AutoSyncProducts Start");
					prods.execute();
					logger.log(Level.INFO, "AutoSyncProducts Done");
					logger.log(Level.INFO, "AutoSyncOrders Start");
					orders.execute();
					logger.log(Level.INFO, "AutoSyncOrders Done");
				}else{
					break;
				}
				logger.log(Level.INFO, "Sleep Sync Thread Start");
				Thread.sleep(intervals*60*1000);
				logger.log(Level.INFO, "Sleep Sync Thread Done");
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "AutoSyncProduct Error", e);
		}
	}

}
