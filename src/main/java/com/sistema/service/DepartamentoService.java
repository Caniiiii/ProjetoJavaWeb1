package com.sistema.service;

import java.util.List;

import com.sistema.model.Departamento;

public interface DepartamentoService {

	public void adicionarDepartamento(Departamento depart);
	public void ExcluirDepartamento(int id);
	public void atualizarDepartamento(Departamento depart);
	public Departamento obterDepartamento(int id);
	public List<Departamento> listarDepart();
}
