package com.sistema.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Endereco;
import com.sistema.model.Fabricante;
import com.sistema.service.EnderecoService;
import com.sistema.service.FabricanteService;

@Controller
public class FabricanteController {

	@Autowired
	FabricanteService fabricanteService;
	
	@Autowired
	EnderecoService enderecoService;
	
	@RequestMapping(value = "/fabricante/adicionar")
	public ModelAndView adicionarFabricantePage(){
		ModelAndView mdv = new ModelAndView("cadastroFabricante");
		ArrayList<Endereco> enderecos =  (ArrayList<Endereco>) enderecoService.listarEnderecos();
		ArrayList<Fabricante> fabricantes = (ArrayList<Fabricante>) fabricanteService.listarFabricantes();
		
		mdv.addObject("fabricante", new Fabricante());
		mdv.addObject("fabricantes", fabricantes);
		mdv.addObject("enderecos", enderecos);
		
		return mdv;
	}
	
	@RequestMapping(value="/fabricante/adicionar/process")
	public ModelAndView adicionarFabricante(@ModelAttribute Fabricante fabricante){
		ModelAndView mdv = new ModelAndView("cadastroFabricante");
		ArrayList<Fabricante> fabricantes = (ArrayList<Fabricante>) fabricanteService.listarFabricantes();

        
		Endereco endereco = enderecoService.obterEndereco(fabricante.getStrEndereco());

		fabricanteService.adicionarFabricante(fabricante);
		String message = "Fabricante Cadastrado com sucesso!";
		mdv.addObject("message", message);
		mdv.addObject("fabricantes", fabricantes);

		return mdv;
	}
}
