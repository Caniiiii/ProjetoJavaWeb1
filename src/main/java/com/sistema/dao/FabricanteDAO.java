package com.sistema.dao;

import java.util.List;

import com.sistema.model.Fabricante;

public interface FabricanteDAO {
public void adicionarFabricante(Fabricante fabricante);
public void excluirFabricante(int id);
public void atualizarFabricante(Fabricante fabricante);
public Fabricante obterFabricante(int id);
public List<Fabricante> listarFabricantes();
}
