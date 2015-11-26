package br.com.edivaldo.model;

import java.util.Calendar;


public class CompraVO {

	private int id;
	private int itemQtd;
	private double itemValorUnitario;
	private double itemValorTotal;
	private int produto;
	private Calendar data;
	private int compraQtdItem;
	private double compraValorTotal;
	private int fornecedor;
	private String nomeProduto;
	private String nomeFornecedor;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItemQtd() {
		return itemQtd;
	}
	public void setItemQtd(int itemQtd) {
		this.itemQtd = itemQtd;
	}
	public double getItemValorUnitario() {
		return itemValorUnitario;
	}
	public void setItemValorUnitario(double itemValorUnitario) {
		this.itemValorUnitario = itemValorUnitario;
	}
	public double getItemValorTotal() {
		return itemValorTotal;
	}
	public void setItemValorTotal(double itemValorTotal) {
		this.itemValorTotal = itemValorTotal;
	}
	public int getProduto() {
		return produto;
	}
	public void setProduto(int produto) {
		this.produto = produto;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public int getCompraQtdItem() {
		return compraQtdItem;
	}
	public void setCompraQtdItem(int compraQtdItem) {
		this.compraQtdItem = compraQtdItem;
	}
	public double getCompraValorTotal() {
		return compraValorTotal;
	}
	public void setCompraValorTotal(double compraValorTotal) {
		this.compraValorTotal = compraValorTotal;
	}
	public int getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}
}
