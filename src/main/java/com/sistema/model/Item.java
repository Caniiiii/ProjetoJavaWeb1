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
@Table(name = "iten")
public class Item {

	@Id
	@GeneratedValue
	private Integer id_item;
	private int codigo;
	private int numeroPlaqueta;
	private Calendar dataDeCompra;
	private String nomeItem;
	
	@ManyToMany
	@JoinTable(name="item_fabricante", joinColumns=@JoinColumn(name="id_item"),
	inverseJoinColumns=@JoinColumn(name="id_fabricante"))
	private List <Fabricante> fabricantes;
	private Calendar tempoGarantia;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
    private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private Departamento departamento;
	private String responsavel;
	private String observcao;
	private String imagemProduto;
	private String notaFiscalPdf;

	

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

	public Calendar getDataDeCompra() {
		return dataDeCompra;
	}

	public void setDataDeCompra(Calendar dataDeCompra) {
		this.dataDeCompra = dataDeCompra;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public Fabricante getFabricante() {
		return (Fabricante) fabricantes;
	}

	public void setFabricante(List <Fabricante> fabricantes) {
		this.fabricantes = fabricantes;
	}

	public Calendar getTempoGarantia() {
		return tempoGarantia;
	}

	public void setTempoGarantia(Calendar tempoGarantia) {
		this.tempoGarantia = tempoGarantia;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getObservcao() {
		return observcao;
	}

	public void setObservcao(String observcao) {
		this.observcao = observcao;
	}

	public String getImagemProduto() {
		return imagemProduto;
	}

	public void setImagemProduto(String imagemProduto) {
		this.imagemProduto = imagemProduto;
	}

	public String getNotaFiscalPdf() {
		return notaFiscalPdf;
	}

	public void setNotaFiscalPdf(String notaFiscalPdf) {
		this.notaFiscalPdf = notaFiscalPdf;
	}

}
