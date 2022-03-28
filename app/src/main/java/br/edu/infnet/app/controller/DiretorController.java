package br.edu.infnet.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DiretorController {
	
	@GetMapping(value = "/diretor")
	public String cadastro() {
		return "diretor/cadastro";
	}
	
	
	@PostMapping(value = "/diretor/create")
	public String create() {
		return "index";
	}

}
