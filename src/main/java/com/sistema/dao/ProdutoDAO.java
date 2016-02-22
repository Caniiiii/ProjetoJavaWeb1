package com.sistema.dao;

import java.util.List;

import com.sistema.model.Produto;

public interface ProdutoDAO {
public void adicionarProduto(Produto produto);
public void ExcluirProduto(int id);
public void atualizarProduto(Produto Produto);
public Produto obterProduto(int id);
public Produto produtoPorCodigo(int codigo);
public List<Produto> listarProdutos();
}
