package com.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.dao.ItemDAO;
import com.sistema.model.Item;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemDAO itemDao;
	
	@Override
	public void addItem(Item item) {
      itemDao.addItem(item);		
	}

	@Override
	public void atualizarItem(Item item) {
        itemDao.atualizarItem(item);		
	}

	@Override
	public Item getItem(int id) {
		
		return itemDao.getItem(id);
	}

	@Override
	public void delItem(int id) {
	    itemDao.delItem(id);	
	}

	@Override
	public List<Item> getItemList() {
		return itemDao.getItemList();
	}

}
