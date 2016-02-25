package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.ItensDAO;
import com.sistema.model.Item;

@Service
@Transactional
public class ItensServiceImpl implements ItensService {

	@Autowired
	ItensDAO itensDAO;
	
	@Override
	public void CadastrarItem(Item itens) {
		itensDAO.CadastrarItem(itens);
	}

	@Override
	public void excluirItem(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarItem(Item item) {
       itensDAO.atualizarItem(item);		
	}

	@Override
	public Item obterItem(int id) {
		
		return itensDAO.obterItem(id);
	}

	@Override
	public List<Item> listarItem() {
		return itensDAO.listarItem();
	}

}
