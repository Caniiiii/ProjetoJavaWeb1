package com.sistema.dao;

import java.util.List;

import com.sistema.model.Unidade;

public interface UnidadeDAO {

	public List <Unidade> getUnidadeList();
	public void adicionarUnidade(Unidade unidade);
	public Unidade obterUnidade(int id);
}
