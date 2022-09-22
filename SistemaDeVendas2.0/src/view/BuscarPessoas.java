/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import ControlerGeral.Controller;
import dao.FuncionarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.Funcionario;
import model.ModelTabela;

/**
 *
 * @author anderson
 */
public class BuscarPessoas extends javax.swing.JFrame {


    private ArrayList<Funcionario> ListFuncionario;
    private Funcionario funcionario;
    private FuncionarioDAO funcionarioDAO;
    private ArrayList dados;
    private Controller controller;
    /**
     * Creates new form BuscarPessoas
     */
    public BuscarPessoas() {
        initComponents();
        funcionarioDAO = new FuncionarioDAO();
        funcionario = new Funcionario();
        ListFuncionario = new ArrayList<>();
        dados = new ArrayList();
        controller = new Controller();        
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePessoas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 460, 260);

        setSize(new java.awt.Dimension(523, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoasMouseClicked
        int codigo = Integer.parseInt(""+jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 0));
        String CnpjCpf = ""+jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 2);
        ListFuncionario = funcionarioDAO.mostrarFuncionarios();
        for(int i = 0; i < ListFuncionario.size(); i++){
            if(codigo == ListFuncionario.get(i).getCodigo() && CnpjCpf.equals(ListFuncionario.get(i).getCpf())){
                funcionario.setCodigo(codigo);
                funcionario.setNome(ListFuncionario.get(i).getNome());
                funcionario.setSenha(ListFuncionario.get(i).getSenha());
                funcionario.setCpf(CnpjCpf);
                controller.receberInformacoesPessoa(funcionario);
                this.dispose();
            }
        }

    }//GEN-LAST:event_jTablePessoasMouseClicked

    public void preencherTabela() {
        
           String[] colunas = new String[]{"ID", "Nome", "CPF"};
        
        try {
            dados.clear();
            ListFuncionario.clear(); //limpa o arrray list
            ListFuncionario = funcionarioDAO.mostrarFuncionarios();        
            ListFuncionario.clear();
            for(int i = 0; i < ListFuncionario.size(); i++){
                dados.add(new Object[]{ListFuncionario.get(i).getCodigo(),ListFuncionario.get(i).getNome(), ListFuncionario.get(i).getCpf()});  
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento das pessoas\n" + ex);
        }

        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTablePessoas.setModel(modelo);
        jTablePessoas.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTablePessoas.getColumnModel().getColumn(0).setResizable(false);
        jTablePessoas.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTablePessoas.getColumnModel().getColumn(1).setResizable(false);
        jTablePessoas.getColumnModel().getColumn(2).setPreferredWidth(112);
        jTablePessoas.getColumnModel().getColumn(2).setResizable(false);
        jTablePessoas.getTableHeader().setReorderingAllowed(false);
        jTablePessoas.setAutoResizeMode(jTablePessoas.AUTO_RESIZE_OFF);
        jTablePessoas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
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
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePessoas;
    // End of variables declaration//GEN-END:variables
}
