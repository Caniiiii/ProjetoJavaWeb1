package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Categoria;

@Repository
public class CategoriaDAOimpl implements CategoriaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void adicionarCategoria(Categoria categoria) {
      getCurrentSession().save(categoria);		
	}

	@Override
	public void excluirCategoria(int id) {
		Categoria categoria = obterCategoria(id);
		
		if(categoria != null)
		 getCurrentSession().delete(categoria);	
	}

	@Override
	public void atualizarCategoria(Categoria categoria) {
		Categoria categoriaAtualizar = obterCategoria(categoria.getId());
		categoriaAtualizar.setNomeCategoria(categoria.getNomeCategoria());
		categoriaAtualizar.setObservacao(categoria.getObservacao());
		 
		getCurrentSession().update(categoriaAtualizar);
		
	}

	@Override
	public Categoria obterCategoria(int id) {
		return (Categoria) getCurrentSession().get(Categoria.class, id);
	}

	@Override
	public List<Categoria> listarCategorias() {
		return getCurrentSession().createQuery("from Categoria").list();
	}
	
	
	
}
