package com.sistema.service;

import java.util.List;

import com.sistema.model.Item;

public interface ItensService {

	public void CadastrarItem(Item itens);
	public void excluirItem(int id);
	public void atualizarItem(Item item);
	public Item obterItem(int id);
	public List<Item> listarItem();

}
