package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.DepartamentoDAO;
import com.sistema.model.Departamento;

@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDAO departDAO;
	@Override
	public void adicionarDepartamento(Departamento depart) {
           departDAO.adicionarDepartamento(depart);		
	}

	@Override
	public void ExcluirDepartamento(int id) {
		departDAO.ExluirDepartamento(id);
	}

	@Override
	public void atualizarDepartamento(Departamento depart) {
		departDAO.atualizarDepart(depart);
	}

	@Override
	public Departamento obterDepartamento(int id) {
		return departDAO.obeterDepart(id);
	}

	@Override
	public List<Departamento> listarDepart() {
		return departDAO.listarDepart();
	}

}
