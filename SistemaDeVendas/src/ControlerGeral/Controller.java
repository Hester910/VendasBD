/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlerGeral;

import model.Funcionario;
import model.Produto;
import view.BuscarPessoas;
import view.BuscarProdutos;
import view.BuscarProdutosParaEditar;
import view.CadCategoria;
import view.CadFornecedor;
import view.CadProduto;
import view.CadUsuario;
import view.FormaPagamento;
import view.PDV;
import view.Venda;

/**
 *
 * @author Anderson
 */
public class Controller {
    private static CadFornecedor cadFornecedor;
    private static CadUsuario cadUsuario;
    private static CadProduto cadProduto;
    private static CadCategoria cadCategoria;
    private static Venda venda;
    private static PDV pdv;
    private static BuscarProdutos buscarProduto;
    private static BuscarProdutosParaEditar buscarProdutoParaEditar;
    private static BuscarPessoas buscarPessoas;
    private static FormaPagamento formaPagamento;
    
    public static void abrirCadFornecedor(){
        if(cadFornecedor == null) cadFornecedor = new CadFornecedor();
        
        cadFornecedor.setVisible(true);
    } 
    public static void abrirCadUsuario(){
        if(cadUsuario == null) cadUsuario = new CadUsuario();
        
        cadUsuario.setVisible(true);
    }
    public static void abrirCadProduto(){
        if(cadProduto == null) cadProduto = new CadProduto();
        
        cadProduto.setVisible(true);
    }
    public static void abrirCadCategoria(){
        if(cadCategoria == null) cadCategoria = new CadCategoria();
        
        cadCategoria.setVisible(true);
    }
    public static void abrirVenda(){
        if(venda == null) venda = new Venda();
        
        venda.setVisible(true);
    }
    public static void abrePdv(){
        if(pdv == null) pdv = new PDV();
        
        pdv.setVisible(true);
    }
    public static void abreBuscarPessoas(){
        if(buscarPessoas == null) buscarPessoas = new BuscarPessoas();
        
        buscarPessoas.setVisible(true);
    }
    public static void abreBuscarProdutos(){
        if(buscarProduto == null) buscarProduto = new BuscarProdutos();
        
        buscarProduto.setVisible(true);
    }
    
    public static void abreBuscarProdutosParaEditar(){
        if(buscarProdutoParaEditar == null) buscarProdutoParaEditar = new BuscarProdutosParaEditar();
        
        buscarProdutoParaEditar.setVisible(true);
    }
    
    public static void abreFormaPagamento(){
        if(formaPagamento == null) formaPagamento = new FormaPagamento();
        
        formaPagamento.setVisible(true);
    }
    
    public static void enviarInformacoesDoPdv(String valorTotal){
        formaPagamento.receberInformacoesPDV(valorTotal);
    }
    
    public static void RecebeInformacoesProduto(Produto produto){
        pdv.receberProduto(produto);
    }    
    
    public static void RecebeInformacoesProduto2(Produto produto){
        cadProduto.receberProduto(produto);
    }
    
    public static void receberInformacoesPessoa(Funcionario funcionario){
        pdv.receberPessoa(funcionario);
    }
    
    public void receberConfirmacaoPagamento(String formaDePagamento,String AcrescimoDesconto,double valorAcrescimoDesconto){
       pdv.confirmacaoPagamento( formaDePagamento, AcrescimoDesconto, valorAcrescimoDesconto);
    }
}
