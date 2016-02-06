package com.sistema.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unidade")
public class Unidade {

	@Id
	@GeneratedValue
	private Integer id_unidade;
	private Integer id_endereco;
	private String nomeUnidade;
	private String telefone;
	private Integer strEndereco;

	@OneToMany(mappedBy = "unidade")
	private List<Departamento> departamentos;
	
	@OneToOne
	@JoinColumn(name = "id_unidade")
	private Endereco endereco;

	@ManyToMany(mappedBy = "unidades")
    private List<Item> items;
	private String observacao;

	public Integer getId() {
		return id_unidade;
	}

	public void setId(Integer id) {
		this.id_unidade = id;
	}

	

	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Departamento> getDepartamento() {
		return departamentos;
	}

	public void setDepartamento(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
     
	
	public Integer getStrEndereco() {
		return strEndereco;
	}

	public void setStrEndereco(Integer strEndereco) {
		this.strEndereco = strEndereco;
	}
	
	

	public Integer getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Integer id_endereco) {
		this.id_endereco = id_endereco;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
