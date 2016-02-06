package com.sistema.dao;

import java.util.List;

import com.sistema.model.Departamento;

public interface DepartamentoDAO {
public void adicionarDepartamento(Departamento depart);
public void ExluirDepartamento(int id);
public void atualizarDepart(Departamento depart);
public Departamento obeterDepart(int id);
public List<Departamento> listarDepart();

}
