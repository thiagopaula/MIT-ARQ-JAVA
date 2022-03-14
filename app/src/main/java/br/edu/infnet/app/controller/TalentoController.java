package br.edu.infnet.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class TalentoController {

	@GetMapping(value = "/talento")
	public String cadastro() {
		return "talento/cadastro";
	}
	
	
	@PostMapping(value = "/talento/create")
	public String create() {
		return "index";
	}
}
