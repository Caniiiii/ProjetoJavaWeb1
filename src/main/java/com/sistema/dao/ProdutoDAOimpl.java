package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Departamento;
import com.sistema.model.Fabricante;
import com.sistema.model.Produto;

@Repository
public class ProdutoDAOimpl implements ProdutoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void adicionarProduto(Produto produto) {
       getCurrentSession().save(produto);   		
	}

	@Override
	public void ExcluirProduto(int id) {
		Produto produto = obterProduto(id);
		if(produto!=null)
          getCurrentSession().delete(produto);		
	}

	@Override
	public void atualizarProduto(Produto produto) {
		Produto produtoAtualizar = obterProduto(produto.getId());
		produtoAtualizar.setCodigo(produto.getCodigo());
		produtoAtualizar.setCategoria(produto.getCategoria());
		produtoAtualizar.setFabricante(produto.getFabricante());
		produtoAtualizar.setImagemProduto(produto.getImagemProduto());
		produtoAtualizar.setNomeProduto(produto.getNomeProduto());
		
		getCurrentSession().update(produtoAtualizar);
	}
	

	@Override
	public Produto obterProduto(int id) {
		return (Produto) getCurrentSession().get(Produto.class, id);
	}

	@Override
	public List<Produto> listarProdutos() {
		return getCurrentSession().createQuery("from Produto").list();
	}


	@Override
	public Produto produtoPorCodigo(int codigo) {
		String sql = "SELECT FROM produtos where codigo="+codigo;
		return (Produto) getCurrentSession().createSQLQuery(sql);
	}

}
