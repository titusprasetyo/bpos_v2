package com.openbravo.pos.imports;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JComponent;
import javax.swing.JPanel;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.forms.AppView;
import com.openbravo.pos.forms.JPanelView;

public class JPanelSync extends JPanel implements JPanelView {
	private Connection con;
	private Statement stmt;
	private String SQL;
	private AppConfig config;

	public JPanelSync(AppView oApp) {
		this(oApp.getProperties());
	}

	public JPanelSync(AppProperties props) {
		initComponents();

		config = new AppConfig(props.getConfigFile());
		config.load();

		jMessageBox.setText("Performing this action, will clear all " + "data in the CSVImport table. \n\n"
				+ "It is recommended that this is performed before " + "running a new import. \n");
	}

	@Override
	public String getTitle() {
		return AppLocal.getIntString("Menu.DataSync");
	}

	@Override
	public void activate() throws BasicException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deactivate() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public JComponent getComponent() {
		return this;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jMessageBox = new javax.swing.JTextPane();
		jEnableButton = new javax.swing.JCheckBox();
		jButtonCleardb = new javax.swing.JButton();

		setPreferredSize(new java.awt.Dimension(420, 240));

		jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pos_messages"); // NOI18N
		jLabel1.setText(bundle.getString("label.csvresetimport")); // NOI18N

		jMessageBox.setEditable(false);
		jMessageBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jScrollPane1.setViewportView(jMessageBox);

		jEnableButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jEnableButton.setText(bundle.getString("label.csvenableclear")); // NOI18N
		jEnableButton.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jEnableButtonStateChanged(evt);
			}
		});
		jEnableButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jEnableButtonActionPerformed(evt);
			}
		});

		jButtonCleardb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jButtonCleardb
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/sale_delete.png"))); // NOI18N
		jButtonCleardb.setText(bundle.getString("label.csvclearlog")); // NOI18N
		jButtonCleardb.setEnabled(false);
		jButtonCleardb.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCleardbActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1)
								.addGroup(layout.createSequentialGroup().addComponent(jEnableButton).addGap(74, 74, 74)
										.addComponent(jButtonCleardb)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButtonCleardb).addComponent(jEnableButton))
						.addContainerGap(32, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void jEnableButtonStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jEnableButtonStateChanged
		if (jEnableButton.isSelected()) {
			jButtonCleardb.setEnabled(true);
		} else {
			jButtonCleardb.setEnabled(false);
		}
	}// GEN-LAST:event_jEnableButtonStateChanged

	private void jButtonCleardbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCleardbActionPerformed
		SQL = "DELETE FROM CSVIMPORT";
		try {
			stmt.executeUpdate(SQL);
		} catch (Exception e) {
		}
	}// GEN-LAST:event_jButtonCleardbActionPerformed

	private void jEnableButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jEnableButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jEnableButtonActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonCleardb;
	private javax.swing.JCheckBox jEnableButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextPane jMessageBox;
	private javax.swing.JScrollPane jScrollPane1;
	// End of variables declaration//GEN-END:variables

}
