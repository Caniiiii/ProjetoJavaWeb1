package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Item;

@Repository
public class ItensDAOimpl implements ItensDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void CadastrarItem(Item itens) {
		getCurrentSession().save(itens);
	}

	@Override
	public void excluirItem(int id) {
      Item item = obterItem(id);
      
      if(item!=null)
       getCurrentSession().delete(item);	  
	}

	@Override
	public void atualizarItem(Item item) {
	   Item itemAtualizar = obterItem(item.getId());
	   itemAtualizar.setCodigo(item.getCodigo());
	   itemAtualizar.setDataDeCompra(item.getDataDeCompra());
	   itemAtualizar.setDepartamento(item.getDepartamento());
	   itemAtualizar.setDepartId(item.getDepartId());
	   itemAtualizar.setNotaCaminho(item.getNotaCaminho());
	   itemAtualizar.setNotaFiscalPdf(item.getNotaFiscalPdf());
	   itemAtualizar.setNumeroPlaqueta(item.getNumeroPlaqueta());
	   itemAtualizar.setObservacao(item.getObservacao());
	   itemAtualizar.setProdId(item.getProdId());
	   itemAtualizar.setProduto(item.getProduto());
	   itemAtualizar.setQuantidade(item.getQuantidade());
	   itemAtualizar.setResponsavel(item.getResponsavel());
	   itemAtualizar.setSituacao(item.getSituacao());
	   itemAtualizar.setUniId(item.getUniId());
	   itemAtualizar.setUnidade(item.getUnidade());
	   
	   getCurrentSession().update(itemAtualizar);
		
	}

	@Override
	public Item obterItem(int id) {
	  return  (Item) getCurrentSession().get(Item.class, id);
	}

	@Override
	public List<Item> listarItem() {
		return getCurrentSession().createQuery("from Item").list();
	}

}
