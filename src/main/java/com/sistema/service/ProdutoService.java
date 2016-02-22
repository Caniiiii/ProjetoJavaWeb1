package com.sistema.service;

import java.util.List;

import com.sistema.model.Produto;

public interface ProdutoService {
public void adicionarProduto(Produto produto);
public void excluirProduto(int id);
public void atualizarProduto(Produto produto);
public Produto obterProduto(int id);
public List<Produto> listarProdutos();
public Produto produtoPorCodigo(int codigo);
}
