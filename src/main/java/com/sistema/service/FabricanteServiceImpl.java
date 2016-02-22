package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.FabricanteDAO;
import com.sistema.model.Fabricante;

@Service
@Transactional
public class FabricanteServiceImpl implements FabricanteService{

	
	@Autowired
	FabricanteDAO fabricanteDAO;
	
	@Override
	public void adicionarFabricante(Fabricante fabricante) {
        fabricanteDAO.adicionarFabricante(fabricante);		
	}

	@Override
	public void excluirFabricante(int id) {
        fabricanteDAO.excluirFabricante(id);		
	}

	@Override
	public void atualizarFabricante(Fabricante fabricante) {
        fabricanteDAO.atualizarFabricante(fabricante);		
	}

	@Override
	public Fabricante obterFabricante(int id) {
		return fabricanteDAO.obterFabricante(id);
	}

	@Override
	public List<Fabricante> listarFabricantes() {
		return fabricanteDAO.listarFabricantes();
	}

}
