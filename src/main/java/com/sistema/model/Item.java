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
	private String situacao;
	@ManyToMany
	@JoinTable(name="item_fabricante", joinColumns=@JoinColumn(name="id_item"),
	inverseJoinColumns=@JoinColumn(name="id_fabricante"))
	private List <Fabricante> fabricantes;
	private String tempoGarantia;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
    private Categoria categoria;
	
	@ManyToMany
	@JoinTable(name="item_departamento", joinColumns=@JoinColumn(name="id_item"),
	inverseJoinColumns=@JoinColumn(name="id_departamento"))
	private List <Departamento> departamentos;
	private String responsavel;
	private String observacao;
	private String imagemProduto;
	private String notaFiscalPdf;
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name="quantidade_id")
    private QuantidadeItens quantidades;
	
	@ManyToMany
	@JoinTable(name="item_unidade", joinColumns=@JoinColumn(name="id_item"),
	inverseJoinColumns=@JoinColumn(name="id_unidade"))
	private List <Unidade> unidades;

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

	public String getTempoGarantia() {
		return tempoGarantia;
	}

	public void setTempoGarantia(String tempoGarantia) {
		this.tempoGarantia = tempoGarantia;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Departamento getDepartamento() {
		return (Departamento) departamentos;
	}

	public void setDepartamento(List <Departamento> departamentos) {
		this.departamentos = departamentos;
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

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	
	
	
}
