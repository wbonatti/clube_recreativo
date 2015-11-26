package br.com.edivaldo.model;

import java.util.Calendar;


public class AtendimentoVO {

	private int id;
	private Calendar data;
	private int compraQtdItem;
	private double compraValorTotal;
	private int fatura;
	private int faturaSequencia;
	private int colaborador;
	private int socio;
	private double itemValorUnitario;
	private int servico;
	private String nomeSocio;
	private String nomeColaborador;
	private String nomeServico;
	
	public String getNomeSocio() {
		return nomeSocio;
	}
	public void setNomeSocio(String nomeSocio) {
		this.nomeSocio = nomeSocio;
	}
	public String getNomeColaborador() {
		return nomeColaborador;
	}
	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getFatura() {
		return fatura;
	}
	public void setFatura(int fatura) {
		this.fatura = fatura;
	}
	public int getFaturaSequencia() {
		return faturaSequencia;
	}
	public void setFaturaSequencia(int faturaSequencia) {
		this.faturaSequencia = faturaSequencia;
	}
	public int getColaborador() {
		return colaborador;
	}
	public void setColaborador(int colaborador) {
		this.colaborador = colaborador;
	}
	public int getSocio() {
		return socio;
	}
	public void setSocio(int socio) {
		this.socio = socio;
	}
	public double getItemValorUnitario() {
		return itemValorUnitario;
	}
	public void setItemValorUnitario(double itemValorUnitario) {
		this.itemValorUnitario = itemValorUnitario;
	}
	public int getServico() {
		return servico;
	}
	public void setServico(int servico) {
		this.servico = servico;
	}
	
}
