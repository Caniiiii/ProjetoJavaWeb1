package com.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Endereco;
import com.sistema.model.Unidade;
import com.sistema.service.EnderecoService;
import com.sistema.service.UnidadeService;

@Controller
public class UnidadeController {

	@Autowired
	private UnidadeService uniService;
	
	@Autowired
	private EnderecoService endService;

	@RequestMapping(value = "/unidade/cadastro")
	public ModelAndView addUsuarioPage() {
		ModelAndView modelAndView = new ModelAndView("cadastroUnidade");
		List <Endereco> enderecos = endService.listarEnderecos();
		modelAndView.addObject("enderecos", enderecos);
        
		modelAndView.addObject("unidade", new Unidade());

		return modelAndView;

	}

	@RequestMapping(value = "/unidade/cadastro/process", method = RequestMethod.POST)
	public ModelAndView addingUsuario(@ModelAttribute Unidade unidade) {

		ModelAndView modelAndView = new ModelAndView("cadastroUnidade");
		unidade.setEndereco(endService.obterEndereco(unidade.getStrEndereco()));
		unidade.setId_endereco(endService.obterEndereco(unidade.getStrEndereco()).getId());
		uniService.adicionarUnidade(unidade);
		String message = "Unidade cadastrada com sucesso!";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

}
