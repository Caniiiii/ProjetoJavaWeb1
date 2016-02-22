package com.sistema.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quantidade_Itens")
public class QuantidadeItens {

	@Id
	@GeneratedValue
	private Integer quantidade_id;
	
 
	private int numDeItens;
	

	public Integer getId() {
		return quantidade_id;
	}

	public void setId(Integer id) {
		this.quantidade_id = id;
	}

	public int getNumDeItens() {
		return numDeItens;
	}

	public void setNumDeItens(int numDeItens) {
		this.numDeItens = numDeItens;
	}
	
	
	
}
