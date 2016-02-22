package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Fabricante;

@Repository
public class FabricanteDAOimpl implements FabricanteDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void adicionarFabricante(Fabricante fabricante) {
		getCurrentSession().save(fabricante);
		
	}

	@Override
	public void excluirFabricante(int id) {
        Fabricante fabricante = obterFabricante(id);
        
        if(fabricante != null)
        	getCurrentSession().delete(fabricante);
	}

	@Override
	public void atualizarFabricante(Fabricante fabricante) {
         Fabricante fabricanteAtualiza = obterFabricante(fabricante.getId());
         fabricanteAtualiza.setEndereco(fabricante.getEndereco());
         fabricanteAtualiza.setNomeFabricante(fabricante.getNomeFabricante());
         fabricanteAtualiza.setSite(fabricante.getSite());
         fabricanteAtualiza.setTelefone(fabricante.getTelefone());
         fabricanteAtualiza.setObservacao(fabricante.getObservacao());
         
         getCurrentSession().update(fabricanteAtualiza);
	}

	@Override
	public Fabricante obterFabricante(int id) {
		return (Fabricante) getCurrentSession().get(Fabricante.class, id);
	}

	@Override
	public List<Fabricante> listarFabricantes() {
		return getCurrentSession().createQuery("from Fabricante").list();
	}

}
