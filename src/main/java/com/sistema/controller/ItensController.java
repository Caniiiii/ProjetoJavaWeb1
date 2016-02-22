package com.sistema.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Departamento;
import com.sistema.model.Item;
import com.sistema.model.Produto;
import com.sistema.model.Unidade;
import com.sistema.service.DepartamentoService;
import com.sistema.service.ItensService;
import com.sistema.service.ProdutoService;
import com.sistema.service.UnidadeService;

@Controller
public class ItensController {

	@Autowired
	ItensService itensService;
	
	@Autowired
	UnidadeService unidadeService;
	
	@Autowired
	DepartamentoService departService;
	
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping(value="/itens/cadastrar")
	public ModelAndView cadastrarItensPage(){
		ModelAndView mdv = new ModelAndView("cadastroItem");
		ArrayList<Unidade> unidades = (ArrayList<Unidade>) unidadeService.getUnidadeList();
		ArrayList <Departamento>departs = (ArrayList<Departamento>) departService.listarDepart();
		ArrayList<Produto> produtos = (ArrayList<Produto>) produtoService.listarProdutos();
		
		mdv.addObject("unidades", unidades);
		mdv.addObject("departs", departs);
		mdv.addObject("produtos", produtos);
		mdv.addObject("item", new Item());
		return mdv;
	}
	
	@RequestMapping(value="/itens/cadastrar/process")
	public ModelAndView cadastrarItens(@ModelAttribute Item item){
		ModelAndView mdv = new ModelAndView("cadastroItem");
		Unidade unidade = unidadeService.obterUnidade(item.getUniId());
		item.setUnidades(unidade);
		Departamento departamento = departService.obterDepartamento(item.getDepartId());
		item.setDepartamento(departamento);
		Produto produto = produtoService.obterProduto(item.getProdId());
		item.setProduto(produto);
		
		itensService.CadastrarItem(item);
		String message = "Item adicionado com sucesso!";
		mdv.addObject("message", message);
		return mdv;
	}
	

	
}
