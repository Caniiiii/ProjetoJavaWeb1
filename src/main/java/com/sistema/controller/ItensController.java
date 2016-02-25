package com.sistema.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.JOptCommandLinePropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Categoria;
import com.sistema.model.Departamento;
import com.sistema.model.Item;
import com.sistema.model.Produto;
import com.sistema.model.Unidade;
import com.sistema.model.Usuario;
import com.sistema.service.CategoriaService;
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

	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/itens/cadastrar")
	public ModelAndView cadastrarItensPage() {
		ModelAndView mdv = new ModelAndView("cadastroItem");
		ArrayList<Unidade> unidades = (ArrayList<Unidade>) unidadeService.getUnidadeList();
		ArrayList<Departamento> departs = (ArrayList<Departamento>) departService.listarDepart();
		ArrayList<Produto> produtos = (ArrayList<Produto>) produtoService.listarProdutos();

		mdv.addObject("unidades", unidades);
		mdv.addObject("departs", departs);
		mdv.addObject("produtos", produtos);
		mdv.addObject("item", new Item());
		return mdv;
	}

	@RequestMapping(value = "/itens/cadastrar/process")
	public ModelAndView cadastrarItens(@ModelAttribute Item item) {
		ModelAndView mdv = new ModelAndView("cadastroItem");
		Unidade unidade = unidadeService.obterUnidade(item.getUniId());
		item.setUnidade(unidade);
		Departamento departamento = departService.obterDepartamento(item.getDepartId());
		item.setDepartamento(departamento);
		Produto produto = produtoService.obterProduto(item.getProdId());
		item.setProduto(produto);

		ArrayList<Unidade> unidades = (ArrayList<Unidade>) unidadeService.getUnidadeList();
		ArrayList<Departamento> departs = (ArrayList<Departamento>) departService.listarDepart();
		ArrayList<Produto> produtos = (ArrayList<Produto>) produtoService.listarProdutos();

		mdv.addObject("unidades", unidades);
		mdv.addObject("departs", departs);
		mdv.addObject("produtos", produtos);

		itensService.CadastrarItem(item);
		String message = "Item adicionado com sucesso!";
		mdv.addObject("message", message);
		return mdv;
	}

	// Relatório por Categoria
	@RequestMapping(value = "/relatorio/categoria")
	public ModelAndView relatorioCategoria() {
		ModelAndView mdv = new ModelAndView("visualizarPorCategoria");

		ArrayList<Categoria> categorias = (ArrayList<Categoria>) categoriaService.listarCategorias();
		mdv.addObject("categoria", new Categoria());
		mdv.addObject("categorias", categorias);

		return mdv;
	}

	@RequestMapping(value = "/relatorio/envio")
	public ModelAndView relatorioCategoriaEnvio(@ModelAttribute Categoria categoria) {
		ModelAndView mdv = new ModelAndView("visualizarPorCategoria");

		ArrayList<Item> itens = (ArrayList<Item>) itensService.listarItem();
		ArrayList<Item> itensParaEnviar = new ArrayList<Item>();

		int len = itens.size();
		for (int i = 0; i < len; i++) {
			if (categoria.getNomeCategoria().equals(itens.get(i).getProduto().getCategoria().getNomeCategoria())) {
				itensParaEnviar.add(itens.get(i));
			}
		}

		int quantidade = 0;

		int len1 = itensParaEnviar.size();
		for (int i = 0; i < len1; i++) {
			quantidade += itensParaEnviar.get(i).getQuantidade();
		}

		ArrayList<Categoria> categorias = (ArrayList<Categoria>) categoriaService.listarCategorias();
		mdv.addObject("categorias", categorias);
		mdv.addObject("quantidades", quantidade);
		mdv.addObject("itens", itensParaEnviar);
		return mdv;
	}

	// Relatório por departamento
	@RequestMapping(value = "/relatorio/departamento")
	public ModelAndView relatorioDepartamento() {
		ModelAndView mdv = new ModelAndView("visualizarPorDepartamento");

		ArrayList<Departamento> departamentos = (ArrayList<Departamento>) departService.listarDepart();
		mdv.addObject("departamento", new Departamento());
		mdv.addObject("departamentos", departamentos);

		return mdv;
	}

	@RequestMapping(value = "relatorio/departamento/envio")
	public ModelAndView relatorioDepartamentoEnvio(@ModelAttribute Departamento departamento) {
		ModelAndView mdv = new ModelAndView("visualizarPorDepartamento");

		ArrayList<Item> itens = (ArrayList<Item>) itensService.listarItem();
		ArrayList<Item> itensParaEnviar = new ArrayList<Item>();

		int len = itens.size();
		for (int i = 0; i < len; i++) {
			if (departamento.getNomeDepartamento().equals(itens.get(i).getDepartamento().getNomeDepartamento()))
				itensParaEnviar.add(itens.get(i));

		}

		int quantidade = 0;

		int len1 = itensParaEnviar.size();
		for (int i = 0; i < len1; i++) {
			quantidade += itensParaEnviar.get(i).getQuantidade();
		}

		ArrayList<Departamento> departamentos = (ArrayList<Departamento>) departService.listarDepart();
		mdv.addObject("departamentos", departamentos);
		mdv.addObject("quantidades", quantidade);
		mdv.addObject("itens", itensParaEnviar);
		return mdv;
	}

	// Relatório por Unidade
	@RequestMapping(value = "/relatorio/unidade")
	public ModelAndView relatorioUnidade() {
		ModelAndView mdv = new ModelAndView("visualizarPorUnidade");

		ArrayList<Unidade> unidades = (ArrayList<Unidade>) unidadeService.getUnidadeList();
		mdv.addObject("unidade", new Unidade());
		mdv.addObject("unidades", unidades);

		return mdv;
	}

	@RequestMapping(value = "relatorio/unidade/envio")
	public ModelAndView relatorioUnidadeEnvio(@ModelAttribute Unidade unidade) {
		ModelAndView mdv = new ModelAndView("visualizarPorUnidade");

		ArrayList<Item> itens = (ArrayList<Item>) itensService.listarItem();
		ArrayList<Item> itensParaEnviar = new ArrayList<Item>();

		int len = itens.size();
		for (int i = 0; i < len; i++) {
			if (unidade.getNomeUnidade().equals(itens.get(i).getUnidade().getNomeUnidade()))
				itensParaEnviar.add(itens.get(i));

		}

		int quantidade = 0;

		int len1 = itensParaEnviar.size();
		for (int i = 0; i < len1; i++) {
			quantidade += itensParaEnviar.get(i).getQuantidade();
		}
		
		ArrayList<Unidade> unidades = (ArrayList<Unidade>) unidadeService.getUnidadeList();
		
		mdv.addObject("unidades", unidades);
		mdv.addObject("quantidades", quantidade);
		mdv.addObject("itens", itensParaEnviar);
		return mdv;

	}
	
	
	//Deletear item
	@RequestMapping(value = "/item/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteItem(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("itemRemovido");
		itensService.excluirItem(id);
		String message = "Item removido com sucesso!";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	
	//Atualizar Item
	@RequestMapping(value = "/item/edita/{id}", method = RequestMethod.GET)
	public ModelAndView editItemPage(@PathVariable Integer id) {
		ModelAndView mdv = new ModelAndView("atualizarItem");
		Item item = itensService.obterItem(id);
		mdv.addObject("item", item);
		ArrayList<Unidade> unidades = (ArrayList<Unidade>) unidadeService.getUnidadeList();
		ArrayList<Departamento> departs = (ArrayList<Departamento>) departService.listarDepart();
		ArrayList<Produto> produtos = (ArrayList<Produto>) produtoService.listarProdutos();

		mdv.addObject("unidades", unidades);
		mdv.addObject("departs", departs);
		mdv.addObject("produtos", produtos);
		return mdv;
	}
	
	@RequestMapping(value = "/item/edita/{id}", method = RequestMethod.POST)
	public ModelAndView edditingUsuario(@ModelAttribute Item item, @PathVariable Integer id) {

		ModelAndView modelAndView = new ModelAndView("itemAtualizado");
		
		Unidade unidade = unidadeService.obterUnidade(item.getUniId());
		item.setUnidade(unidade);
		Departamento departamento = departService.obterDepartamento(item.getDepartId());
		item.setDepartamento(departamento);
		Produto produto = produtoService.obterProduto(item.getProdId());
		item.setProduto(produto);

		itensService.atualizarItem(item);

		String message = "Item atualizado com sucesso!";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

}
