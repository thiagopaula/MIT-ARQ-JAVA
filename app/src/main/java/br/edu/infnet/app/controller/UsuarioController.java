package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(value = "/usuarios")
	public String lista(Model model) {

		model.addAttribute("listaUsuario", usuarioService.obterLista());

		return "usuario/lista";
	}
	
	
	@PostMapping(value = "/usuario/create")
	public String create(Usuario usuario) {		
				
		usuarioService.create(usuario);

		return "redirect:/usuarios";
	}
	
	@GetMapping(value = "/usuario/{id}/delete")
	public String delete(@PathVariable Integer id) {
		
		usuarioService.delete(id);		

		return "redirect:/usuarios";
	}
	

}
