/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.FuncionarioDAO;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author Anderson
 */
public class CadUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadUsuario
     */
    public CadUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JLabel();
        Nome1 = new javax.swing.JLabel();
        Nome2 = new javax.swing.JLabel();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome.setText("CPF");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Nome1.setText("Nome");
        getContentPane().add(Nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        Nome2.setText("Senha");
        getContentPane().add(Nome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTextFieldcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, -1));
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, -1));
        getContentPane().add(jTextFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        setSize(new java.awt.Dimension(416, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcpfActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
                String nome = jTextFieldNome.getText();
                String cpf = jTextFieldcpf.getText();
                String senha = jTextFieldSenha.getText();
                Funcionario funcionario = new Funcionario(nome, cpf, senha);
                FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
                funcionarioDAO.inserirFuncionario(funcionario);
                JOptionPane.showMessageDialog(null, "Funcionario inserido com sucesso!");
        }catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o funcionario");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Nome1;
    private javax.swing.JLabel Nome2;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldcpf;
    // End of variables declaration//GEN-END:variables
}