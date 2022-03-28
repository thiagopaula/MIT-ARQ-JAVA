package br.edu.infnet.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AtorController {
	
	@GetMapping(value = "/ator")
	public String cadastro() {
		return "ator/cadastro";
	}
	
	
	@PostMapping(value = "/ator/create")
	public String create() {
		return "index";
	}

}
