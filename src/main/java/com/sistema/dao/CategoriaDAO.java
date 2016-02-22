package com.sistema.dao;

import java.util.List;

import com.sistema.model.Categoria;

public interface CategoriaDAO {
public void adicionarCategoria(Categoria categoria);
public void excluirCategoria(int id);
public void atualizarCategoria(Categoria categoria);
public Categoria obterCategoria(int id);
public List<Categoria> listarCategorias();

}
