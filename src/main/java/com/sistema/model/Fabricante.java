package com.sistema.model;

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
@Table(name = "fabricante")
public class Fabricante {

	@Id
	@GeneratedValue
	private Integer id_fabricante;
	private String nomeFabricante;
	@OneToMany(mappedBy="fabricante")
	private List <Endereco> endereco;
	
	@OneToMany(mappedBy = "fabricante")
	private List<Produto> produtos;
	private String telefone;
	private String site;
	private String observacao;
	private Integer strEndereco;

	

	public Integer getId() {
		return id_fabricante;
	}

	public void setId(Integer id) {
		this.id_fabricante = id;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getStrEndereco() {
		return strEndereco;
	}

	public void setStrEndereco(Integer strEndereco) {
		this.strEndereco = strEndereco;
	}
	
	

}
