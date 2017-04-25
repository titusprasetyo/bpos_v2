package com.busoftinc.pos.util;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.openbravo.pos.forms.AppLocal;

public class LicenceWindow extends javax.swing.JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4574862590845992762L;
	private boolean isEndSub = false;
	LicencePanel m_rootapp;
	public LicenceWindow(boolean b) {
		//setUndecorated(true);
		setResizable(false);
		
		initComponents();
		
		initFrame();
		
		this.isEndSub = b;
	}
	
	public void initFrame(){
		m_rootapp = new LicencePanel(this.isEndSub);
		add(m_rootapp, BorderLayout.CENTER);  
		setTitle(AppLocal.APP_NAME + " - " + AppLocal.APP_VERSION);
        try {
            this.setIconImage(ImageIO.read(LicenceWindow.class.getResourceAsStream("/com/openbravo/images/favicon.png")));
        } catch (IOException e) {
        }      
        //pack();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, d.width/2, d.height/2); 
        setLocationRelativeTo(null);
        setVisible(true);
	}

	private void initComponents() {

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

		System.exit(0);

	}// GEN-LAST:event_formWindowClosing

	private void formWindowClosed(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosed

		System.exit(0);

	}
}
