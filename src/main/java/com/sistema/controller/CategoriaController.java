package com.sistema.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Categoria;
import com.sistema.service.CategoriaService;

@Controller
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;
	
	@RequestMapping(value = "/categoria/adicionar")

	public ModelAndView adicionarCategoriaPage(){
		ModelAndView mdv = new ModelAndView("cadastroCategoria");
		mdv.addObject("categoria", new Categoria());
		ArrayList<Categoria> categorias = (ArrayList<Categoria>) categoriaService.listarCategorias();
		mdv.addObject("categorias", categorias);
		
		return mdv;
	}
	
	@RequestMapping(value = "/categoria/adicionar/process")
	public ModelAndView adicionarCategoria(@ModelAttribute Categoria categoria){
		ModelAndView mdv = new ModelAndView("cadastroCategoria");
		categoriaService.adicionarCategoria(categoria);
		String message = "Categoria Cadastrada com sucesso!";
		mdv.addObject("message", message);
		
		return mdv;
		
	}

	
}
