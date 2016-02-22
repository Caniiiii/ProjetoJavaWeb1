package com.sistema.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Item;

@Repository
public class ItensDAOimpl implements ItensDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void CadastrarItem(Item itens) {
		getCurrentSession().save(itens);
	}

}
