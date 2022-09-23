package model;

import java.util.Date;
import java.sql.Timestamp;

public class Venda {

	private int codigo;
	private Timestamp horario;
	private double valorTotal;
	private String clienteCpf;
	private double desconto;
	private int funcionario;
	private int item;
        private String formaPagamento;

	public Venda(int codigo, Timestamp horario, double valorTotal, String clienteCpf, double desconto,
			int funcionario,String formaPagamento) {

		this.codigo = codigo;
		//this.horario = java.time.LocalTimestampTime.now().toString();
		this.horario = horario;
		this.valorTotal = valorTotal;
		this.clienteCpf = clienteCpf;
		this.desconto = desconto;
		this.funcionario = funcionario;
		//this.item = item;
                this.formaPagamento = formaPagamento;
	}

	
	public Venda(Timestamp horario, double valorTotal, String clienteCpf, double desconto, int funcionario,String formaPagamento
			) {
		super();
		this.horario = horario;
		this.valorTotal = valorTotal;
		this.clienteCpf = clienteCpf;
		this.desconto = desconto;
		this.funcionario = funcionario;
		//this.item = item;
                this.formaPagamento = formaPagamento;
	}


	public Venda() {

	}

	public Venda(int codigo, double valorTotal, String clienteCpf, double desconto, int funcionario,String formaPagamento
			) {
		this.codigo = codigo;
		this.valorTotal = valorTotal;
		this.clienteCpf = clienteCpf;
		this.desconto = desconto;
		this.funcionario = funcionario;
		//this.item = item;
                this.formaPagamento = formaPagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Timestamp getHorario() {
		return horario;
	}

	public void setHorario(Timestamp horario) {
		this.horario = horario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getClienteCpf() {
		return clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
        
        public void setFormaPagamento(String formaPagamento){
            this.formaPagamento = formaPagamento;
        }
        
        public String getFormaPagamento(){
            return formaPagamento;

	

}

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", horario=" + horario + ", valorTotal=" + valorTotal + ", clienteCpf=" + clienteCpf + ", desconto=" + desconto + ", funcionario=" + funcionario + ", formaPagamento=" + formaPagamento + '}';
    }
}
