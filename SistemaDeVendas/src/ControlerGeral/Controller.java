/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlerGeral;

import model.Produto;
import view.CadCategoria;
import view.CadFornecedor;
import view.CadProduto;
import view.CadUsuario;
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
    
    public static void RecebeInformacoesProduto(Produto produto){
        pdv.receberProduto(produto);
    }    
    
    /*public static void receberInformacoesPessoa(PessoaFisicaBeans pessoaFisicaBean,PessoaJuridicaBeans pessoaJuridicaBeans){
        pdv.receberPessoa(pessoaFisicaBean,pessoaJuridicaBeans);
    }
    
    public void receberConfirmacaoPagamento(String formaDePagamento,String AcrescimoDesconto,double valorAcrescimoDesconto){
       pdv.confirmacaoPagamento(formaDePagamento, AcrescimoDesconto, valorAcrescimoDesconto);
    }*/
}
