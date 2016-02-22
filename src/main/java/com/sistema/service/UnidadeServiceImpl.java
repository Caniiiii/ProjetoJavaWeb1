package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.UnidadeDAO;
import com.sistema.model.Unidade;

@Service
@Transactional
public class UnidadeServiceImpl implements UnidadeService {

	@Autowired
	private UnidadeDAO uniDAO;
	@Override
	public List <Unidade> getUnidadeList() {
		return  uniDAO.getUnidadeList();
	}

	@Override
	public void adicionarUnidade(Unidade unidade) {
       uniDAO.adicionarUnidade(unidade);		
	}

	@Override
	public Unidade obterUnidade(int id) {
       return uniDAO.obterUnidade(id);		
	}

}
