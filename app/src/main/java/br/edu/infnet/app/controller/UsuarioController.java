package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario")
	public String cadastro() {
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/create")
	public String create(Usuario usuario) {
		
		usuarioService.create(usuario);

		return "redirect:/";
	}
	

}
