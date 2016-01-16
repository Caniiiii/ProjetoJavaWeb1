package com.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Usuario;
import com.sistema.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/usuario/add")
	public ModelAndView addUsuarioPage() {
		ModelAndView modelAndView = new ModelAndView("add-usuario-form");
		modelAndView.addObject("usuario", new Usuario());
		return modelAndView;
		
	}

	@RequestMapping(value = "/usuario/add/process")
	public ModelAndView addingUsuario(@ModelAttribute Usuario usuario) {

		ModelAndView modelAndView = new ModelAndView("admin");
		usuarioService.addUsuario(usuario);
		String message = "Usuario Adicionado com sucesso!";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
	
	@RequestMapping(value="/usuario/list")
    public ModelAndView listaDeUsuarios() {
        ModelAndView modelAndView = new ModelAndView("lista-usuario");
         
        List<Usuario> usuarios = usuarioService.getUsuarios();
        modelAndView.addObject("usuarios", usuarios);
         
        return modelAndView;
    }

	@RequestMapping(value = "/usuario/edita/{id}", method = RequestMethod.GET)
	public ModelAndView editUsuarioPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("edita-usuario-form");
		Usuario usuario = usuarioService.getUsuario(id);
		modelAndView.addObject("usuario", usuario);
		return modelAndView;
	}

	@RequestMapping(value = "/usuario/edita/{id}", method = RequestMethod.POST)
	public ModelAndView edditingUsuario(@ModelAttribute Usuario usuario, @PathVariable Integer id) {

		ModelAndView modelAndView = new ModelAndView("admin");

		usuarioService.atualizarUsuario(usuario);

		String message = "Usuario editado com sucesso.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/usuario/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUsuario(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("admin");
		usuarioService.delUsuario(id);
		String message = "Usuario removido com sucesso.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
