package br.com.edivaldo.model;

import java.util.Calendar;


public class VendaVO {

	private int id;
	private Calendar date;
	private int itemQtd;
	private double itemValorTotal;
	private int socio;
	private int colaborador;
	private int fatura;
	private int itemFatura;
	private int compraQtdItem;
	private double itemValorUnitario;
	private double compraValorTotal;
	private int produto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public int getItemQtd() {
		return itemQtd;
	}
	public void setItemQtd(int itemQtd) {
		this.itemQtd = itemQtd;
	}
	public double getItemValorTotal() {
		return itemValorTotal;
	}
	public void setItemValorTotal(double itemValorTotal) {
		this.itemValorTotal = itemValorTotal;
	}
	public int getSocio() {
		return socio;
	}
	public void setSocio(int socio) {
		this.socio = socio;
	}
	public int getColaborador() {
		return colaborador;
	}
	public void setColaborador(int colaborador) {
		this.colaborador = colaborador;
	}
	public int getFatura() {
		return fatura;
	}
	public void setFatura(int fatura) {
		this.fatura = fatura;
	}
	public int getItemFatura() {
		return itemFatura;
	}
	public void setItemFatura(int itemFatura) {
		this.itemFatura = itemFatura;
	}
	public int getCompraQtdItem() {
		return compraQtdItem;
	}
	public void setCompraQtdItem(int compraQtdItem) {
		this.compraQtdItem = compraQtdItem;
	}
	public double getItemValorUnitario() {
		return itemValorUnitario;
	}
	public void setItemValorUnitario(double itemValorUnitario) {
		this.itemValorUnitario = itemValorUnitario;
	}
	public double getCompraValorTotal() {
		return compraValorTotal;
	}
	public void setCompraValorTotal(double compraValorTotal) {
		this.compraValorTotal = compraValorTotal;
	}
	public int getProduto() {
		return produto;
	}
	public void setProduto(int produto) {
		this.produto = produto;
	}

}
