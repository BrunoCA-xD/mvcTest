/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcTest.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import mvcTest.controller.PessoaController2;
import mvcTest.model.bo.MyException;
import mvcTest.model.vo.PessoaVO;

/**
 *
 * @author bruno
 */
public class PessoaView2 extends javax.swing.JFrame {

    PessoaController2 control = new PessoaController2();

    /**
     * Creates new form PessoaView
     */
    public PessoaView2() {
        initComponents();
        setPreferredSize(new java.awt.Dimension(314, 364));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabpnl = new javax.swing.JTabbedPane();
        pnlRoot = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLuckyNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnSee = new javax.swing.JButton();
        btnLeave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(310, 356));
        getContentPane().setLayout(new java.awt.CardLayout());

        tabpnl.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabpnlStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cadastro de numeros da sorte (loteria)");

        jLabel2.setText("Nome:");

        jLabel3.setText("Nº da sorte:");

        btnSend.setText("Enviar");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnSee.setText("Ver Existentes");
        btnSee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeActionPerformed(evt);
            }
        });

        btnLeave.setText("Sair");
        btnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRootLayout = new javax.swing.GroupLayout(pnlRoot);
        pnlRoot.setLayout(pnlRootLayout);
        pnlRootLayout.setHorizontalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLuckyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRootLayout.createSequentialGroup()
                                .addComponent(btnSend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLeave)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlRootLayout.setVerticalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLuckyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(btnSee)
                    .addComponent(btnLeave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabpnl.addTab("tab1", pnlRoot);

        jPanel1.setLayout(new java.awt.BorderLayout());

        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Numero da sorte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPessoa.setColumnSelectionAllowed(true);
        tblPessoa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPessoa);
        tblPessoa.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabpnl.addTab("tab2", jPanel1);

        getContentPane().add(tabpnl, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        /*JOptionPane.showMessageDialog(null, this.getSize()); 310,356 */

        if (new Praticidade().fieldsFilled(pnlRoot)) {
            PessoaVO objPeople = new PessoaVO(txtName.getText(), Integer.parseInt(txtLuckyNumber.getText()));
            try {
                control.send(objPeople);
            } catch (MyException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }

    }//GEN-LAST:event_btnSendActionPerformed

    private void tabpnlStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabpnlStateChanged
        if (tabpnl.getSelectedIndex() == 1) {
            DefaultTableModel model = (DefaultTableModel) tblPessoa.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            try {
                List<PessoaVO> lst = control.lista();
                if (!lst.isEmpty()) {

                    lst.forEach((lst1) -> {
                        model.addRow(new Object[]{
                            lst1.getiCod(),
                            lst1.getsName(),
                            lst1.getiLuckyNumber()});
                    });
                } else {
                    JOptionPane.showMessageDialog(null, "Não ha dados para exibir!");
                }
            } catch (MyException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tabpnlStateChanged

    private void btnSeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeActionPerformed
        try {
            BuscaPessoaView dialog = new BuscaPessoaView(control.lista());
            dialog.setVisible(true);

// TODO add your handling code here:
        } catch (MyException ex) {
            Logger.getLogger(PessoaView2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSeeActionPerformed

    private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeaveActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PessoaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaView2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaView2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeave;
    private javax.swing.JButton btnSee;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JTabbedPane tabpnl;
    private javax.swing.JTable tblPessoa;
    private javax.swing.JTextField txtLuckyNumber;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnSend() {
        return btnSend;
    }

    public void setBtnSend(javax.swing.JButton btnSend) {
        this.btnSend = btnSend;
    }

    public javax.swing.JTextField getTxtLuckyNumber() {
        return txtLuckyNumber;
    }

    public void setTxtLuckyNumber(javax.swing.JTextField txtLuckyNumber) {
        this.txtLuckyNumber = txtLuckyNumber;
    }

    public javax.swing.JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(javax.swing.JTextField txtName) {
        this.txtName = txtName;
    }

    public JPanel getPnlRoot() {
        return pnlRoot;
    }

    public javax.swing.JButton getBtnLeave() {
        return btnLeave;
    }

    public void setBtnLeave(javax.swing.JButton btnLeave) {
        this.btnLeave = btnLeave;
    }

    public javax.swing.JButton getBtnSee() {
        return btnSee;
    }

    public void setBtnSee(javax.swing.JButton btnSee) {
        this.btnSee = btnSee;
    }

    public javax.swing.JTabbedPane getTabpnl() {
        return tabpnl;
    }

    public void setTabpnl(javax.swing.JTabbedPane tabpnl) {
        this.tabpnl = tabpnl;
    }

    public javax.swing.JTable getTblPessoa() {
        return tblPessoa;
    }

    public void setTblPessoa(javax.swing.JTable tblPessoa) {
        this.tblPessoa = tblPessoa;
    }

}
