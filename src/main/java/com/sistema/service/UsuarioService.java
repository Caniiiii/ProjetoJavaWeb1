package com.sistema.service;

import java.util.List;

import com.sistema.model.Usuario;

public interface UsuarioService {

	public void addUsuario(Usuario usuario);
	public void atualizarUsuario(Usuario usuario);
	public Usuario getUsuario(int id);
	public void delUsuario(int id);
	public List <Usuario> getUsuarios();
    public Usuario getSessaoDAO(Usuario usuario);

	
}
