package com.sistema.dao;

import java.util.List;

import com.sistema.model.Usuario;

public interface UsuarioDAO {
    public void addUsuario(Usuario usuario);
    public void atualizarUsuario(Usuario usuario);
    public Usuario getUsuario(int id);
    public void delUsuario(int id);
    public List <Usuario> getLista();
    
}
