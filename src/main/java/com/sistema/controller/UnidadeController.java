package com.sistema.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sistema.model.Departamento;
import com.sistema.model.Endereco;
import com.sistema.model.Unidade;
import com.sistema.service.DepartamentoService;
import com.sistema.service.EnderecoService;
import com.sistema.service.UnidadeService;

@Controller
public class UnidadeController {

	@Autowired
	private UnidadeService uniService;
	
	@Autowired
	private EnderecoService endService;
	
	@Autowired
	DepartamentoService departService;

	@RequestMapping(value = "/unidade/cadastro")
	public ModelAndView addUsuarioPage() {
		ModelAndView modelAndView = new ModelAndView("cadastroUnidade");
		ArrayList <Endereco> enderecos = (ArrayList<Endereco>) endService.listarEnderecos();
		ArrayList<Departamento> departs =  (ArrayList<Departamento>) departService.listarDepart();
		
		modelAndView.addObject("enderecos", enderecos);
        modelAndView.addObject("departs", departs);
		modelAndView.addObject("unidade", new Unidade());

		return modelAndView;

	}

	@RequestMapping(value = "/unidade/cadastro/process", method = RequestMethod.GET)
	public ModelAndView addingUsuario(@ModelAttribute Unidade unidade) {

		ModelAndView modelAndView = new ModelAndView("cadastroUnidade");
		unidade.setEndereco(endService.obterEndereco(unidade.getStrEndereco()));
		unidade.setId_endereco(endService.obterEndereco(unidade.getStrEndereco()).getId());
		ArrayList<Departamento> departs =  (ArrayList<Departamento>) departService.listarDepart();
        departs = (ArrayList<Departamento>) departService.listarDepart();
        unidade.setDepartamentos(departs);
		uniService.adicionarUnidade(unidade);
		String message = "Unidade cadastrada com sucesso!";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

}
