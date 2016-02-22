package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.ProdutoDAO;
import com.sistema.model.Produto;

@Service
@Transactional
public class ProdutoServiceImpl implements ProdutoService {

	
	@Autowired
	ProdutoDAO produtoDAO;

	@Override
	public void adicionarProduto(Produto produto) {
		produtoDAO.adicionarProduto(produto);
	}

	@Override
	public void excluirProduto(int id) {
      produtoDAO.ExcluirProduto(id); 		
	}

	@Override
	public void atualizarProduto(Produto produto) {
       produtoDAO.atualizarProduto(produto);		
	}

	@Override
	public Produto obterProduto(int id) {
		return produtoDAO.obterProduto(id);
	}

	@Override
	public List<Produto> listarProdutos() {
		return produtoDAO.listarProdutos();
	}

	@Override
	public Produto produtoPorCodigo(int codigo) {
		return produtoDAO.produtoPorCodigo(codigo);
	}
	
}
