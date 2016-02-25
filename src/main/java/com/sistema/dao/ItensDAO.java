package com.sistema.dao;

import java.util.List;

import com.sistema.model.Item;

public interface ItensDAO {

	public void CadastrarItem(Item itens);
	public void excluirItem(int id);
	public void atualizarItem(Item item);
	public Item obterItem(int id);
	public List<Item> listarItem();
	
}
