package com.sistema.service;

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

}
