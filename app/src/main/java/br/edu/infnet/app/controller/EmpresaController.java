package br.edu.infnet.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class EmpresaController {

	@GetMapping(value = "/empresa")
	public String cadastro() {
		return "empresa/cadastro";
	}
	
	
	@PostMapping(value = "/empresa/create")
	public String create() {
		return "index";
	}
}
