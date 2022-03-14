package br.edu.infnet.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class OportunidadeController {

	@GetMapping(value = "/oportunidade")
	public String cadastro() {
		return "oportunidade/cadastro";
	}
	
	
	@PostMapping(value = "/oportunidade/create")
	public String create() {
		return "index";
	}
}
