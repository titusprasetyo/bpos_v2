package com.busoftinc.pos;

import com.busoftinc.pos.autosync.SyncProduct;
import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.forms.DataLogicSystem;
import com.openbravo.possync.DataLogicIntegration;
import com.openbravo.possync.ProductsSync;

public class Test {
	public static void main(String[] a) {
		//Thread doRun = new Thread(new SyncProduct());
		//doRun.start();
		
		DataLogicSystem dlSystem = new DataLogicSystem();
		DataLogicIntegration dli = new DataLogicIntegration();
		DataLogicSales dlsales = new DataLogicSales();
		ProductsSync bean = new ProductsSync(dlSystem, dli, dlsales, "0");
		try {
			bean.execute();
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
