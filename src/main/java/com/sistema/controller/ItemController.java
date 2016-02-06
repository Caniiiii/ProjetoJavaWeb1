package com.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Item;
import com.sistema.model.Unidade;
import com.sistema.service.ItemService;
import com.sistema.service.UnidadeService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private UnidadeService uniService;
	
	@RequestMapping(value = "/item/cadastro")
	public ModelAndView addUsuarioPage() {
		ModelAndView modelAndView = new ModelAndView("cadastroItem");
		List <Unidade> unidades = (List<Unidade>) uniService.getUnidadeList();
		modelAndView.addObject("item", new Item());
		modelAndView.addObject("unidades", unidades);

		
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/item/cadastro/process", method = RequestMethod.POST)
	public ModelAndView addingItem(@ModelAttribute Item item) {

		ModelAndView modelAndView = new ModelAndView("cadastroItem");
		itemService.addItem(item);
		String message = "Item adicionado com sucesso!";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

}
