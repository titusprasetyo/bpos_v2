package com.busoftinc.pos.payment;

import java.awt.Component;

import com.openbravo.pos.customers.CustomerInfoExt;
import com.openbravo.pos.payment.JPaymentInterface;
import com.openbravo.pos.payment.PaymentInfo;

public class JPaymentVtCC extends javax.swing.JPanel implements JPaymentInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void activate(CustomerInfoExt customerext, double dTotal, String transactionID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PaymentInfo executePayment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return null;
	}

}
