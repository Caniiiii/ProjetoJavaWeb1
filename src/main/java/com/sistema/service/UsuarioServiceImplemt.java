package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.SessaoDAO;
import com.sistema.dao.UsuarioDAO;
import com.sistema.model.Usuario;

@Service
@Transactional
public class UsuarioServiceImplemt implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private SessaoDAO sessaoDAO;
	
	public void addUsuario(Usuario usuario) {
         usuarioDAO.addUsuario(usuario);		
	}

	public void atualizarUsuario(Usuario usuario) {
         usuarioDAO.atualizarUsuario(usuario);		
	}

	public Usuario getUsuario(int id) {
		return usuarioDAO.getUsuario(id);
	}

	public void delUsuario(int id) {
        usuarioDAO.delUsuario(id);		
	}

	public List<Usuario> getUsuarios() {
	   return usuarioDAO.getLista();
	}

	@Override
	public Usuario getSessaoDAO(Usuario usuario) {
		return sessaoDAO.getSessaoDAO(usuario);
	}
}
