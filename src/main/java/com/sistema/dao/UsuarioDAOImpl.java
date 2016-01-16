package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
    
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

	public void addUsuario(Usuario usuario) {
		getCurrentSession().save(usuario);
		
	}

	public void atualizarUsuario(Usuario usuario) {
       Usuario usuarioToUpdate = getUsuario(usuario.getId());	
       usuarioToUpdate.setUserName(usuario.getUserName());
       usuarioToUpdate.setSenha(usuario.getSenha());
       getCurrentSession().update(usuarioToUpdate);
	}

	public Usuario getUsuario(int id) {
		Usuario usuario = (Usuario)getCurrentSession().get(Usuario.class, id);
		return usuario;
	}

	public void delUsuario(int id) {
		Usuario usuario = getUsuario(id);
		if(usuario != null)
		 getCurrentSession().delete(usuario);	
	}

	public List<Usuario> getLista() {
		return getCurrentSession().createQuery("from Usuario").list();
	}
	
	
	
}
