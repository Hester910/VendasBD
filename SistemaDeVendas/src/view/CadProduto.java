/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import ControlerGeral.Controller;
import dao.CategoriaDAO;
import dao.FornecedorDAO;
import dao.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Fornecedor;
import model.Produto;

/**
 *
 * @author Anderson
 */
public class CadProduto extends javax.swing.JFrame {

    CategoriaDAO categoriaDAO;
    FornecedorDAO fornecedorDAO;
    ProdutoDAO produtoDAO = new ProdutoDAO();
    Produto produto;
    ArrayList<Categoria> listCategoria = new ArrayList<>();
    ArrayList<Fornecedor> listFornecedor = new ArrayList<>();
    private Controller controller;
    boolean editando;
    /**
     * Creates new form CadProduto
     */
    public CadProduto() {
        initComponents();
        categoriaDAO = new CategoriaDAO();
        fornecedorDAO = new FornecedorDAO();
        controller = new Controller();
        PreencherComboBox();
        editando = false;
        jTextFieldCodigo.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldValor.setText("");
        jTextFieldQuantidadeEmEstoque.setText("");
    }
    
    public void receberProduto(Produto produtoBeans){ 
        jTextFieldCodigo.setText(Integer.toString(produtoBeans.getCodigo()));
        jTextFieldDescricao.setText(produtoBeans.getDescricao());
        jComboBoxCategoria.removeAllItems();
        jComboBoxCategoria.addItem(produtoBeans.getCategoria().getNome());
        jTextFieldValor.setText(Double.toString(produtoBeans.getValor()));
        jTextFieldQuantidadeEmEstoque.setText(Integer.toString(1));
        jComboBoxFornecedor.removeAllItems();
        jComboBoxFornecedor.addItem(produtoBeans.getFornecedor().getDescricao());
    }
    
    public void PreencherComboBox(){        
        listCategoria = categoriaDAO.mostrarCategorias();
        listFornecedor = fornecedorDAO.mostrarFornecedor();
        for(Categoria c : listCategoria){
            jComboBoxCategoria.addItem(c.getNome());
            
        }
        for(Fornecedor f : listFornecedor){
            jComboBoxFornecedor.addItem(f.getDescricao());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuantidadeEmEstoque = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxFornecedor = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Descriçao");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(jTextFieldDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, -1));

        jLabel2.setText("Quantidade em estoque");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(jTextFieldQuantidadeEmEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        jLabel3.setText("Valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, -1));

        jComboBoxCategoria.setModel(jComboBoxCategoria.getModel());
        jComboBoxCategoria.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCategoriaPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxCategoriaMouseClicked(evt);
            }
        });
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 150, -1));

        jComboBoxFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxFornecedorMouseClicked(evt);
            }
        });
        getContentPane().add(jComboBoxFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 150, -1));

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel4.setText("Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 90, -1));

        jLabel5.setText("Fornecedor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 100, -1));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);
        getContentPane().add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 30, 30));

        setSize(new java.awt.Dimension(403, 236));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxCategoriaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaPopupMenuWillBecomeVisible

    }//GEN-LAST:event_jComboBoxCategoriaPopupMenuWillBecomeVisible

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        Categoria categoria = new Categoria();
        for(Categoria c : listCategoria){
            if(c.getNome().equals(jComboBoxCategoria.getSelectedItem())){
                categoria = c;
            }            
        }
        for(Fornecedor f : listFornecedor){
            if(f.getDescricao().equals(jComboBoxFornecedor.getSelectedItem())){
                fornecedor = f;
            }
        }
        if(editando){
            try{
                produto = new Produto(Integer.parseInt(jTextFieldCodigo.getText()),jTextFieldDescricao.getText(),Double.parseDouble( jTextFieldValor.getText()), Integer.parseInt(jTextFieldQuantidadeEmEstoque.getText()),fornecedor, categoria);
                produtoDAO.atualizar(produto);
                jTextFieldCodigo.setText("");
                jTextFieldDescricao.setText("");
                jTextFieldValor.setText("");
                jTextFieldQuantidadeEmEstoque.setText("");
                JOptionPane.showMessageDialog(null, "Produto alterado");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possivel alterar o produto");
            }
        }else{
            try{
                produto = new Produto(jTextFieldDescricao.getText(),Double.parseDouble( jTextFieldValor.getText()), Integer.parseInt(jTextFieldQuantidadeEmEstoque.getText()),fornecedor, categoria);
                produtoDAO.inserirProduto(produto);
                jTextFieldCodigo.setText("");
                jTextFieldDescricao.setText("");
                jTextFieldValor.setText("");
                jTextFieldQuantidadeEmEstoque.setText("");
                JOptionPane.showMessageDialog(null, "Produto salvo");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possivel salvar o produto");
            }
            
        }
        editando = false;
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        editando = true;
        controller.abreBuscarProdutosParaEditar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaMouseClicked
        if(editando){
            listCategoria = categoriaDAO.mostrarCategorias();
            jComboBoxCategoria.removeAllItems();
            for(Categoria c : listCategoria){
                jComboBoxCategoria.addItem(c.getNome());
            }
        }
    }//GEN-LAST:event_jComboBoxCategoriaMouseClicked

    private void jComboBoxFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxFornecedorMouseClicked
        if(editando){
            listFornecedor = fornecedorDAO.mostrarFornecedor();
            jComboBoxFornecedor.removeAllItems();
            for(Fornecedor f : listFornecedor){
                jComboBoxFornecedor.addItem(f.getDescricao());
            }
        }
    }//GEN-LAST:event_jComboBoxFornecedorMouseClicked

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
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldQuantidadeEmEstoque;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
