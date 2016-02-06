package com.sistema.service;

import java.util.List;

import com.sistema.model.Endereco;

public interface EnderecoService {
public void adicionarEndereco(Endereco endereco);
public void excluirEndereco(int id);
public Endereco obterEndereco(int id);
public Endereco obterPorCep(int id);
public void atualizarEndereco(Endereco endereco);
public List<Endereco> listarEnderecos();

}
