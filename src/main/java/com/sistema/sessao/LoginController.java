package com.sistema.sessao;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Usuario;
import com.sistema.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	UsuarioService usuarioService;
	
	
	@RequestMapping("loginUsuario")
	  public ModelAndView loginForm() {
		ModelAndView mdv = new ModelAndView("login");
		mdv.addObject("usuario", new Usuario());
	    return mdv;
	  }


	@RequestMapping(value = "/usuario/efetuarLogin")
	public ModelAndView LoginPage(@ModelAttribute Usuario usuario, HttpSession sessao) {

		Usuario user = usuarioService.getSessaoDAO(usuario);

		if (user != null) {
			ModelAndView modelAndView = new ModelAndView("index");
			String message = "Seja bem vindo, "+user.getUserName()+"!";
			modelAndView.addObject("message", message);

			sessao.setAttribute("usuarioLogado", usuario);

			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("login");

		String message = "Usuario ou senha incorretos!";
		modelAndView.addObject("message", message);

		return modelAndView;

	}

	@RequestMapping("/usuario/logout")
	public ModelAndView logout(@ModelAttribute Usuario usuario, HttpSession sessao) {
		sessao.invalidate();
		usuario = null;
		return new ModelAndView("login");
	}
}