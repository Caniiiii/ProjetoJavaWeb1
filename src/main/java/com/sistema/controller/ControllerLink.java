package com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sistema.model.Usuario;

@Controller
public class ControllerLink {

	@RequestMapping(value = "/")
	public ModelAndView mainPage() {
		ModelAndView modelAndView = new ModelAndView("index");

		return  modelAndView;
	}

	@RequestMapping(value = "/adminPage")
	public ModelAndView adminPage() {
		return new ModelAndView("admin");
	}

}
