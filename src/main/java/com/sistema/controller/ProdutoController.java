package com.sistema.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Categoria;
import com.sistema.model.Fabricante;
import com.sistema.model.Produto;
import com.sistema.model.Usuario;
import com.sistema.service.CategoriaService;
import com.sistema.service.FabricanteService;
import com.sistema.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;

	@Autowired
	FabricanteService fabricanteService;

	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/produto/adicionar")
	public ModelAndView adicionarProdutoPage() {
		ModelAndView mdv = new ModelAndView("cadastroProduto");
		ArrayList<Fabricante> fabricantes = (ArrayList<Fabricante>) fabricanteService.listarFabricantes();
		ArrayList<Categoria> categorias = (ArrayList<Categoria>) categoriaService.listarCategorias();

		mdv.addObject("produto", new Produto());
		mdv.addObject("fabricantes", fabricantes);
		mdv.addObject("categorias", categorias);
		return mdv;
	}

	@RequestMapping(value = "/produto/adicionar/process")
	public ModelAndView adicionarProduto(@ModelAttribute Produto produto, HttpServletRequest request) {

		ModelAndView mdv = new ModelAndView("upload-page");
		Fabricante fabricante = fabricanteService.obterFabricante(produto.getCaminhoFab());
		Categoria categoria = categoriaService.obterCategoria(produto.getCaminhoCat());
		produto.setFabricante(fabricante);
		produto.setCategoria(categoria);
		String message = produto.getCodigo() + ".jpg";
		//String root = request.getServletContext().getRealPath("/");
        
		if(System.getProperty("os.name").equals("Windows 7") || System.getProperty("os.name").equals("Windows 8.1")){
		    produto.setImagemProduto( message);
		}else{
		    produto.setImagemProduto( message);
        }
		
		produtoService.adicionarProduto(produto);

		mdv.addObject("message", message);

		return mdv;
	}

	@RequestMapping(value = "/produto/upload-foto/{message}", method = RequestMethod.POST)
	public ModelAndView handleFileUpload(@PathVariable String message, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mdv = new ModelAndView("upload-page");
		String method = request.getMethod();
        String caminhoFoto = null;
		if (method.equals("POST")) {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);

			if (isMultipart) {
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);

				try {
					List items = upload.parseRequest(request);
					Iterator iterator = items.iterator();
					while (iterator.hasNext()) {
						FileItem item = (FileItem) iterator.next();

						if (!item.isFormField()) {
							String fileName = item.getName();

							fileName = message;
							System.out.println(fileName);

							String root = request.getServletContext().getRealPath("/");
							File path = new File(root + "/WEB-INF/img/");

							if (!path.exists()) {
								boolean status = path.mkdirs();
							}

							// configura o caminho da imagem do produto

							File uploadedFile = new File(path + "/" + fileName);
							System.out.println(uploadedFile.getAbsolutePath());
							//caminhoFoto = uploadedFile.getAbsolutePath();
							item.write(uploadedFile);
						}
					}
				} catch (FileUploadException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		String messager = "Produto Castrado com sucesso!";
		mdv.addObject("messager", messager);
		mdv.addObject("caminhoFoto", message);
		return mdv;
	}

	// Visualizar Produto
	@RequestMapping(value = "/produto/visualizar")
	public ModelAndView vizualizaPage() {
		ModelAndView mdv = new ModelAndView("visualizarProduto");
		ArrayList<Produto> produtos = (ArrayList<Produto>) produtoService.listarProdutos();
		mdv.addObject("produtos", produtos);
		return mdv;
	}

	// Delete e upDate Produto
	@RequestMapping(value = "/produto/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteProduto(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("visualizarProduto");
		produtoService.excluirProduto(id);
		String message = "Produto removido com sucesso.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}

	@RequestMapping(value = "/produto/edita/{id}", method = RequestMethod.GET)
	public ModelAndView editProdutoPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("editaProduto");
		Produto produto = produtoService.obterProduto(id);
		ArrayList<Fabricante> fabricantes = (ArrayList<Fabricante>) fabricanteService.listarFabricantes();
		ArrayList<Categoria> categorias = (ArrayList<Categoria>) categoriaService.listarCategorias();
		modelAndView.addObject("fabricantes", fabricantes);
		modelAndView.addObject("categorias", categorias);
		modelAndView.addObject("produto", produto);
		return modelAndView;
	}

	@RequestMapping(value = "/produto/edita/{id}", method = RequestMethod.POST)
	public ModelAndView edditingProduto(@ModelAttribute Produto produto, @PathVariable Integer id) {

		ModelAndView modelAndView = new ModelAndView("visualizarProduto");
		Fabricante fabricante = fabricanteService.obterFabricante(produto.getCaminhoFab());
		Categoria categoria = categoriaService.obterCategoria(produto.getCaminhoCat());
		produto.setFabricante(fabricante);
		produto.setCategoria(categoria);
		produtoService.atualizarProduto(produto);
		String message = "Produto editado com sucesso.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
}
