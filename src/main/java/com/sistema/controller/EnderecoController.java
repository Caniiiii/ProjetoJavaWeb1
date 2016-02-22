package com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Endereco;
import com.sistema.model.Produto;
import com.sistema.service.EnderecoService;

@Controller
public class EnderecoController {
	@Autowired
	private EnderecoService endService;

	@RequestMapping(value = "/endereco/adicionar")
	public ModelAndView adicionarEnderecoPage() {
		ModelAndView modelAndView = new ModelAndView("adicionarEndereco");
		modelAndView.addObject("endereco", new Endereco());

		return modelAndView;

	}

	@RequestMapping(value = "/endereco/adicionar/process")
	public ModelAndView adicionarEndereco(@ModelAttribute Endereco endereco) {
		ModelAndView modelAndView = new ModelAndView("adicionarEndereco");
		endService.adicionarEndereco(endereco);
		String message = "Endereco adicionado com sucesso!";
		modelAndView.addObject("message", message);

		return modelAndView;

	}

}
