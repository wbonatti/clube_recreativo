package br.com.edivaldo.model;

import java.util.Calendar;


public class EmprestimoVO {

	private int id;
	private Calendar data;
	private int compraQtdItem;
	private double compraValorTotal;
	private int socio;
	private int colaborador;
	private int fatura;
	private int faturaSequencia;
	private Calendar dataPrevisao;
	private Calendar dataDevolucao;
	private int acervo;
	private double itemValorUnitario;
	private String nomeSocio;
	private String nomeAcervo;
	private String nomeColaborador;
	
	public String getNomeSocio() {
		return nomeSocio;
	}
	public void setNomeSocio(String nomeSocio) {
		this.nomeSocio = nomeSocio;
	}
	public String getNomeAcervo() {
		return nomeAcervo;
	}
	public void setNomeAcervo(String nomeAcervo) {
		this.nomeAcervo = nomeAcervo;
	}
	public String getNomeColaborador() {
		return nomeColaborador;
	}
	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
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
	public int getFaturaSequencia() {
		return faturaSequencia;
	}
	public void setFaturaSequencia(int faturaSequencia) {
		this.faturaSequencia = faturaSequencia;
	}
	public Calendar getDataPrevisao() {
		return dataPrevisao;
	}
	public void setDataPrevisao(Calendar dataPrevisao) {
		this.dataPrevisao = dataPrevisao;
	}
	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public int getAcervo() {
		return acervo;
	}
	public void setAcervo(int acervo) {
		this.acervo = acervo;
	}
	public double getItemValorUnitario() {
		return itemValorUnitario;
	}
	public void setItemValorUnitario(double itemValorUnitario) {
		this.itemValorUnitario = itemValorUnitario;
	}
}
