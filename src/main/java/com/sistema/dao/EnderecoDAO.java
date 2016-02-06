package com.sistema.dao;

import java.util.List;

import com.sistema.model.Endereco;

public interface EnderecoDAO {
public void adicionarEndereco(Endereco endereco);
public void excluirEndereco(int id);
public void atualizarEndereco(Endereco endereco);
public Endereco obterEndereco(int id);
public Endereco obterPorCep(int id);
public List<Endereco> listarEnd();
}
