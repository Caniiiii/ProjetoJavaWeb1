package com.sistema.service;

import java.util.List;

import com.sistema.model.Unidade;

public interface UnidadeService {

	public List <Unidade> getUnidadeList();

	public void adicionarUnidade(Unidade unidade);
	public Unidade obterUnidade(int id);
}
