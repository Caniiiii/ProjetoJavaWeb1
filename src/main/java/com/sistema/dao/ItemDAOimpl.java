package com.sistema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sistema.model.Departamento;
import com.sistema.model.Fabricante;
import com.sistema.model.Item;

@Repository
public class ItemDAOimpl implements ItemDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addItem(Item item) {
		getCurrentSession().save(item);
	}

	@Override
	public void atualizarItem(Item item) {
           Item itemToUpdate = getItem(item.getId());
           itemToUpdate.setCategoria(item.getCategoria());
           itemToUpdate.setCodigo(item.getCodigo());
           itemToUpdate.setDataDeCompra(item.getDataDeCompra());
           itemToUpdate.setDepartamento((List<Departamento>) item.getDepartamento());
           itemToUpdate.setFabricante((List<Fabricante>) item.getFabricante());
           itemToUpdate.setImagemProduto(item.getImagemProduto());
           itemToUpdate.setNomeItem(item.getNomeItem());
           itemToUpdate.setNotaFiscalPdf(item.getNotaFiscalPdf());
           itemToUpdate.setNumeroPlaqueta(item.getNumeroPlaqueta());
           itemToUpdate.setObservacao(item.getObservacao());
           itemToUpdate.setTempoGarantia(item.getTempoGarantia());
           itemToUpdate.setResponsavel(item.getResponsavel());
           itemToUpdate.setSituacao(item.getSituacao());
           itemToUpdate.setUnidades(item.getUnidades());
           
           
	       getCurrentSession().update(itemToUpdate);

	}

	@Override
	public Item getItem(int id) {
		Item item = (Item) getCurrentSession().get(Item.class, id);
		return item;
	}

	@Override
	public void delItem(int id) {
         Item item = getItem(id);
         if(item!=null)
         getCurrentSession().delete(item);	 
	}

	@Override
	public List<Item> getItemList() {
		return getCurrentSession().createQuery("from Item").list();

	}

}
