package com.sistema.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Usuario;

@Repository
public class SessaoDAOimpl implements SessaoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Usuario getSessaoDAO(Usuario usuario) {
		Usuario user = null;
		String hbn = "from Usuario";
		List list = (List) getCurrentSession().createQuery(hbn).list();

		for (int i = 0; i < list.size(); i++) {
			if (usuario.getUserName().equals(((Usuario) list.get(i)).getUserName())
					&& usuario.getSenha().equals(((Usuario) list.get(i)).getSenha()))
				user = (Usuario) list.get(i);
		}
		return user;

	}
}
