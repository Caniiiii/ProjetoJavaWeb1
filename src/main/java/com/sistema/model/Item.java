package com.sistema.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue
	private Integer id_item;
	private int codigo;
	private int numeroPlaqueta;
	private String dataDeCompra;
	private String situacao;
	private String responsavel;
	private String observacao;
	private String notaFiscalPdf;
	private int quantidade;
	private Integer uniId;
	private Integer departId;
	private Integer prodId;
	private String notaCaminho;
	
	@ManyToOne
	@JoinColumn(name="id_unidade")
	private Unidade unidade;
	
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private Departamento departamento;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;

	public Integer getId() {
		return id_item;
	}

	public void setId(Integer id) {
		this.id_item = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumeroPlaqueta() {
		return numeroPlaqueta;
	}

	public void setNumeroPlaqueta(int numeroPlaqueta) {
		this.numeroPlaqueta = numeroPlaqueta;
	}

	public String getDataDeCompra() {
		return dataDeCompra;
	}

	public void setDataDeCompra(String dataDeCompra) {
		this.dataDeCompra = dataDeCompra;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNotaFiscalPdf() {
		return notaFiscalPdf;
	}

	public void setNotaFiscalPdf(String notaFiscalPdf) {
		this.notaFiscalPdf = notaFiscalPdf;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Integer getUniId() {
		return uniId;
	}

	public void setUniId(Integer uniId) {
		this.uniId = uniId;
	}

	public Integer getDepartId() {
		return departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}
	

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}


	public String getNotaCaminho() {
		return notaCaminho;
	}

	public void setNotaCaminho(String notaCaminho) {
		this.notaCaminho = notaCaminho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	

}
