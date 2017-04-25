package com.busoftinc.pos.util;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LicencePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField userName;
	private boolean endSub = false;

	public LicencePanel(boolean b) {
		this.endSub = b;
		init();
	}

	private void init() {
		setLayout(new GridBagLayout());
		setEnabled(false);
		setPreferredSize(new java.awt.Dimension(1024, 768));
		JLabel labelInfo = new JLabel("<html><h1>Pengaturan Lisensi "
				//+ (this.endSub==true ? "telah habis masa berlangganan" : "tidak terdaftar")
				+ "</h1><br/>Untuk aktivasi/perpanjangan, Kirim request key di bawah ini ke PT BUSI untuk mendapatkan kode aktivasi<br/>Masukan kode aktivasi pada textbox di bawah ini lalu tekan ENTER</html>");
		userName = new JTextField(20);
		userName.setText(DiskUtils.getUid());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 2;
		add(labelInfo, gbc);
		// gbc.gridx = 0;
		// gbc.gridy = 2;
		// gbc.fill = GridBagConstraints.HORIZONTAL;
		// gbc.gridwidth = 2;
		// add(labelInfoValue, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(userName, gbc);

		userName.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				m_txtKeysKeyTyped(e);
			}
		});
	}

	private void m_txtKeysKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_m_txtKeysKeyTyped
		LicenceHelper l = new LicenceHelper();
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			if (l.isLicContentTrue(userName.getText())) {
				if (l.writeLicence(userName.getText())) {
					JOptionPane.showMessageDialog(this, "Licence Succesfully Installed\nRestart Application Required");
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(this, "Fail to install licence");
					System.exit(0);
				}
			} else {
				JOptionPane.showMessageDialog(this, "Invalid Confirmation Key");
				System.exit(0);
			}
		}
	}
}
