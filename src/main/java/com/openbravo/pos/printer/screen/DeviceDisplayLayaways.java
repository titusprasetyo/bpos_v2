package com.openbravo.pos.printer.screen;

import java.awt.TextArea;
import java.awt.TextField;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.printer.DeviceDisplay;
import com.openbravo.pos.sales.DataLogicReceipts;
import com.openbravo.pos.sales.SharedTicketInfo;

public class DeviceDisplayLayaways extends JFrame implements DeviceDisplay{
	
	private final String m_sName;
	private javax.swing.JPanel m_jContainer;
	private static TextArea textAways;
	private static DataLogicReceipts dlReceipts = null;
	private static DeviceDisplayLayaways instanceExists = null;
	
	public DeviceDisplayLayaways(AppView app){
		initComponents();
		dlReceipts = (DataLogicReceipts) app.getBean("com.openbravo.pos.sales.DataLogicReceipts");
		String listTicket = "";
		SharedTicketInfo s = null;
		try {
			List<SharedTicketInfo> l = dlReceipts.getSharedTicketList();
			for (int i=0;i<l.size();i++){
				s = l.get(i);
				listTicket += s.getName() +"\n";
			}
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m_sName = AppLocal.getIntString("Display.Window");
		textAways.setText(listTicket);
		m_jContainer.add(textAways);
		setVisible(true);
	}
	
	public static DeviceDisplayLayaways getDeviceDisplayLayaways(AppView app){
		if (instanceExists==null){
			return new DeviceDisplayLayaways(app);
		}
		dlReceipts = (DataLogicReceipts) app.getBean("com.openbravo.pos.sales.DataLogicReceipts");
		String listTicket = "";
		SharedTicketInfo s = null;
		try {
			List<SharedTicketInfo> l = dlReceipts.getSharedTicketList();
			for (int i=0;i<l.size();i++){
				s = l.get(i);
				listTicket += s.getName() +"\n";
			}
		} catch (BasicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textAways.setText(listTicket);
		return instanceExists;
	}
	
	private void initComponents() {
        m_jContainer = new javax.swing.JPanel();
        textAways = new TextArea();
        

        setTitle(AppLocal.getIntString("Display.Window")); // NOI18N

        m_jContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        m_jContainer.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        m_jContainer.setLayout(new java.awt.BorderLayout());
        getContentPane().add(m_jContainer, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(767, 245));
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return m_sName;
	}

	@Override
	public String getDisplayDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JComponent getDisplayComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeVisor(int animation, String sLine1, String sLine2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeVisor(String sLine1, String sLine2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearVisor() {
		// TODO Auto-generated method stub
		
	}

}
