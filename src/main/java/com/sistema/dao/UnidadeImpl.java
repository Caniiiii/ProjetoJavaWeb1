package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Unidade;
@Repository
public class UnidadeImpl implements UnidadeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public List <Unidade> getUnidadeList() {
		return  getCurrentSession().createQuery("from Unidade").list();

	}
	@Override
	public void adicionarUnidade(Unidade unidade) {
      getCurrentSession().save(unidade);		
	}
	@Override
	public Unidade obterUnidade(int id) {
      return (Unidade) getCurrentSession().get(Unidade.class, id);		
	}

}
