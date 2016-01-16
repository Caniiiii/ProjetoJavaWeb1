package com.sistema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quantidadeItens")
public class QuantidadeItens {

	@Id
	@GeneratedValue
	private Integer id;
	private int codigo;
	private int quantidade;
	private int quantItens;
    
	
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantItens() {
		return quantItens;
	}

	public void setQuantItens(int quantItens) {
		this.quantItens = quantItens;
	}

	
}
