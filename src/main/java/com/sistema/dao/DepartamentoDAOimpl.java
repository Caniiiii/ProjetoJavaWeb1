package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Departamento;

@Repository
public class DepartamentoDAOimpl implements DepartamentoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void adicionarDepartamento(Departamento depart) {
		getCurrentSession().save(depart);
	}

	@Override
	public void ExluirDepartamento(int id) {
      Departamento depart = obeterDepart(id);
      if(depart!=null)
        getCurrentSession().delete(depart);	  
	}

	@Override
	public void atualizarDepart(Departamento depart) {
       Departamento departParaAtualizar = obeterDepart(depart.getId());
       departParaAtualizar.setNomeDepartamento(depart.getNomeDepartamento());
       departParaAtualizar.setTelefone(depart.getTelefone());
       departParaAtualizar.setUnidade(depart.getUnidade());
       departParaAtualizar.setObservacao(depart.getObservacao());
       
       getCurrentSession().update(departParaAtualizar);
	}

	@Override
	public Departamento obeterDepart(int id) {
		Departamento depart = (Departamento) getCurrentSession().get(Departamento.class, id);
		return depart;
	}

	@Override
	public List<Departamento> listarDepart() {
		return getCurrentSession().createQuery("from Departamento").list();
	}

}
