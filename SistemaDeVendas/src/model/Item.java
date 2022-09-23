package model;

public class Item {

	private int codigo;
	private double quantidade;
	private double valorParcial;
	private Produto produto;
        private int codigoVenda;

    public Item(int codigo, double quantidade, double valorParcial, Produto produto, int codigoVenda) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorParcial = valorParcial;
        this.produto = produto;
        this.codigoVenda = codigoVenda;
    }

	

	public Item() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorParcial() {
		return valorParcial;
	}

	public void setValorParcial(double valorParcial) {
		this.valorParcial = valorParcial;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", quantidade=" + quantidade + ", valorParcial=" + valorParcial + ", produto="
				+ produto + "]";
	}

}
