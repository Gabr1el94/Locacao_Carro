/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.mysql.jdbc.Statement;
import dados.Dados;
import javax.swing.JOptionPane;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author gabriel
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        btnGerar.setEnabled(false);
        jPF_PJ.setEnabled(false);
        jFormattedText_Cpf.setEnabled(false);
        jFormattedText_CNPJ.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jrbAlugado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jrbCarros = new javax.swing.JRadioButton();
        btnGerar = new javax.swing.JButton();
        jtxtTipo = new javax.swing.JLabel();
        jPF_PJ = new javax.swing.JComboBox<>();
        jFormattedText_Cpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedText_CNPJ = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jrbAlugado.setText("Carros Alugados pelo Cliente");
        jrbAlugado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAlugadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Tipos de Relatório:");

        jrbCarros.setText("Carros com a Filiação");
        jrbCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCarrosActionPerformed(evt);
            }
        });

        btnGerar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jtxtTipo.setText("Tipo:");

        jPF_PJ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "PF", "PJ" }));
        jPF_PJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPF_PJActionPerformed(evt);
            }
        });

        try {
            jFormattedText_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("CPF:");

        try {
            jFormattedText_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setText("CNPJ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jrbAlugado)
                                    .addComponent(jrbCarros)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtTipo)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jPF_PJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jFormattedText_Cpf)
                                            .addComponent(jFormattedText_CNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))))
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbCarros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbAlugado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPF_PJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedText_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedText_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCarrosActionPerformed
        // TODO add your handling code here:
        if (jrbCarros.isSelected()) {
            btnGerar.setEnabled(true);
            jFormattedText_CNPJ.setEnabled(false);
            jFormattedText_Cpf.setEnabled(false);
            jPF_PJ.setEnabled(false);
            jPF_PJ.setSelectedIndex(0);
            jFormattedText_CNPJ.setText("");
            jFormattedText_Cpf.setText("");
            jrbAlugado.setSelected(false);
        } else {
            btnGerar.setEnabled(false);
        }

    }//GEN-LAST:event_jrbCarrosActionPerformed

    private void jrbAlugadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAlugadoActionPerformed
        // TODO add your handling code here:
        if (jrbAlugado.isSelected()) {
            jPF_PJ.setEnabled(true);
            jrbCarros.setSelected(false);
        } else {
            jPF_PJ.setEnabled(false);
            btnGerar.setEnabled(false);
        }
    }//GEN-LAST:event_jrbAlugadoActionPerformed

    private void jPF_PJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPF_PJActionPerformed
        // TODO add your handling code here:
        if (jPF_PJ.getSelectedItem().equals("PF")) {
            jFormattedText_Cpf.setEnabled(true);
            jFormattedText_CNPJ.setText("");
            btnGerar.setEnabled(true);
            jFormattedText_CNPJ.setEnabled(false);
        } else if (jPF_PJ.getSelectedItem().equals("PJ")) {
            jFormattedText_CNPJ.setEnabled(true);
            jFormattedText_Cpf.setText("");
            btnGerar.setEnabled(true);
            jFormattedText_Cpf.setEnabled(false);
        } else {
            jFormattedText_Cpf.setEnabled(false);
            jFormattedText_CNPJ.setText("");
            jFormattedText_Cpf.setText("");
            btnGerar.setEnabled(false);
            jFormattedText_CNPJ.setEnabled(false);
        }
    }//GEN-LAST:event_jPF_PJActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        // TODO add your handling code here:
        String sql = null;
        try {

            if (jrbCarros.isSelected()) {
                sql = " SELECT v.fli_CNPJ FROM Filial as f inner join Veiculo as v ";
                sql += " on f.fli_CNPJ=v.fli_CNPJ";
            }

            if (jrbAlugado.isSelected()) {

                if (jPF_PJ.equals("PF")) {

                    if (jFormattedText_Cpf.getText().length() < 14) {
                        //view Message
                    } else {
                        //gerar relatório
                    }

                } else if (jPF_PJ.equals("PJ")) {

                    if (jFormattedText_CNPJ.getText().length() < 18) {
                        //view Message
                    } else {
                        //gerar relatório
                    }

                }

            }

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnGerarActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFormattedTextField jFormattedText_CNPJ;
    private javax.swing.JFormattedTextField jFormattedText_Cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jPF_PJ;
    private javax.swing.JRadioButton jrbAlugado;
    private javax.swing.JRadioButton jrbCarros;
    private javax.swing.JLabel jtxtTipo;
    // End of variables declaration//GEN-END:variables
}
