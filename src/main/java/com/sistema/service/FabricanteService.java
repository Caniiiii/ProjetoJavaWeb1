package com.sistema.service;

import java.util.List;

import com.sistema.model.Fabricante;

public interface FabricanteService {

	public void adicionarFabricante(Fabricante fabricante);
	public void excluirFabricante(int id);
	public void atualizarFabricante(Fabricante fabricante);
	public Fabricante obterFabricante(int id);
	public List<Fabricante> listarFabricantes();
}
