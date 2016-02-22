package com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Departamento;
import com.sistema.service.DepartamentoService;

@Controller
public class DepartamentoController {
	@Autowired
	private DepartamentoService departService;
	
	@RequestMapping(value = "/departamento/adicionar")
	public ModelAndView adicionarDepartamentoPage() {
		ModelAndView modelAndView = new ModelAndView("cadastroDepartamento");
		modelAndView.addObject("departamento", new Departamento());

		return modelAndView;

	}
	
	@RequestMapping(value = "/departamento/adicionar/process")
	public ModelAndView adicionarDepartamento(@ModelAttribute Departamento departamento){
		ModelAndView modewAndView = new ModelAndView("cadastroDepartamento");
		departService.adicionarDepartamento(departamento);
		String message = "Departamento Cadastrado com sucesso!";
		modewAndView.addObject("message",message);
		return modewAndView;
	}
	


}
