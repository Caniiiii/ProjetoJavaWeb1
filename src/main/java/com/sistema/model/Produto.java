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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue
	private Integer id_produto;
	private int codigo;
	private String nomeProduto;
	@ManyToOne
	@JoinColumn(name="id_fabricante")
	private Fabricante fabricante;
	private String tempoGarantia;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
    private Categoria categoria;
	
	@OneToMany(mappedBy="produto")
	private List<Item> itens;
	
	
	private String observacao;
	private String imagemProduto;
	private Integer caminhoFab;
	private Integer caminhoCat;
	
	


	public Integer getId() {
		return id_produto;
	}

	public void setId(Integer id) {
		this.id_produto = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeItem) {
		this.nomeProduto = nomeItem;
	}

	public Fabricante getFabricante() {
		return  fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
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

	public Integer getCaminhoFab() {
		return caminhoFab;
	}

	public void setCaminhoFab(Integer caminhoFab) {
		this.caminhoFab = caminhoFab;
	}

	public Integer getCaminhoCat() {
		return caminhoCat;
	}

	public void setCaminhoCat(Integer caminhoCat) {
		this.caminhoCat = caminhoCat;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> Itens) {
		this.itens = Itens;
	}

	
	
}
