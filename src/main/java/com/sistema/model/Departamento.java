package com.sistema.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {

	@Id
    @GeneratedValue
	private Integer id_departamento;
	private String nomeDepartamento;
	private String telefone;
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name="id_unidade")
	private Unidade unidade;
	
	@OneToMany
	@JoinColumn(name="departamento")
	private List<Item> itens;

	
	public Integer getId() {
		return id_departamento;
	}

	public void setId(Integer id) {
		this.id_departamento = id;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
}
