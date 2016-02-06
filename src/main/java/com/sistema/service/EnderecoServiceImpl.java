package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.EnderecoDAO;
import com.sistema.model.Endereco;

@Service
@Transactional
public class EnderecoServiceImpl implements EnderecoService{

	@Autowired
	private EnderecoDAO endDAO;
	
	@Override
	public void adicionarEndereco(Endereco endereco) {
       endDAO.adicionarEndereco(endereco);		
	}

	@Override
	public void excluirEndereco(int id) {
       endDAO.excluirEndereco(id);		
	}

	@Override
	public Endereco obterEndereco(int id) {
		
		return endDAO.obterEndereco(id);
	}

	@Override
	public void atualizarEndereco(Endereco endereco) {
      endDAO.atualizarEndereco(endereco);		
	}

	@Override
	public List<Endereco> listarEnderecos() {
		return endDAO.listarEnd();
	}

	@Override
	public Endereco obterPorCep(int id) {
		return endDAO.obterPorCep(id);
	}

}
