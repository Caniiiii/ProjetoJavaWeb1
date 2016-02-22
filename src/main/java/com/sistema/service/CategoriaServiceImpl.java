package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.CategoriaDAO;
import com.sistema.model.Categoria;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaDAO categoriaDAO;

	@Override
	public void adicionarCategoria(Categoria categoria) {
         categoriaDAO.adicionarCategoria(categoria);		
	}

	@Override
	public void excluirCategoria(int id) {
		categoriaDAO.excluirCategoria(id);
		
	}

	@Override
	public void atualizarCategoria(Categoria categoria) {
       categoriaDAO.atualizarCategoria(categoria);		
	}

	@Override
	public Categoria obterCategoria(int id) {
		return categoriaDAO.obterCategoria(id);
	}

	@Override
	public List<Categoria> listarCategorias() {
		return categoriaDAO.listarCategorias();
	}
	
	
}
