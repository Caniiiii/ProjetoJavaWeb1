package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Endereco;

@Repository
public class EnderecoImplDAO implements EnderecoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void adicionarEndereco(Endereco endereco) {
		getCurrentSession().save(endereco);

	}

	@Override
	public void excluirEndereco(int id) {
      Endereco endereco = obterEndereco(id);
      if(endereco!=null)
      getCurrentSession().delete(endereco);
	}

	@Override
	public void atualizarEndereco(Endereco endereco) {
     Endereco endAtualiza = obterEndereco(endereco.getId());
     endAtualiza.setBairro(endereco.getBairro());
     endAtualiza.setCep(endereco.getCep());
     endAtualiza.setCidade(endereco.getCidade());
     endAtualiza.setEstado(endereco.getEstado());
     endAtualiza.setFabricante(endereco.getFabricante());
     endAtualiza.setLogradouro(endereco.getLogradouro());
     endAtualiza.setNumero(endereco.getNumero());
     endAtualiza.setPais(endereco.getPais());
     endAtualiza.setUnidade(endereco.getUnidade());
      
      getCurrentSession().update(endAtualiza);
	}

	@Override
	public Endereco obterEndereco(int id) {
		Endereco endereco = (Endereco) getCurrentSession().get(Endereco.class, id);
 		return endereco;
	}

	@Override
	public List<Endereco> listarEnd() {
		return getCurrentSession().createQuery("from Endereco").list();
	}

	@Override
	public Endereco obterPorCep(int id) {
		Endereco endereco = (Endereco) getCurrentSession().get(Endereco.class, id);
		return endereco;
	}

}
