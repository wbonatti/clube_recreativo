package br.com.edivaldo.model;

public class ProdutoVO {

	private int id;
	private String nome;
	private double compra;
	private double venda;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCompra() {
		return compra;
	}
	public void setCompra(double compra) {
		this.compra = compra;
	}
	public double getVenda() {
		return venda;
	}
	public void setVenda(double venda) {
		this.venda = venda;
	}
	
	
}