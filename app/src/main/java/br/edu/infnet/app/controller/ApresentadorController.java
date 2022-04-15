package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.ApresentadorService;

@Controller
public class ApresentadorController {

	@Autowired
	private ApresentadorService apresentadorService;

	@GetMapping(value = "/apresentador")
	public String cadastro() {
		return "apresentador/cadastro";
	}

	@GetMapping(value = "/apresentadores")
	public String lista(Model model,  @SessionAttribute("usuarioLogado") Usuario usuario) {

		model.addAttribute("listaTalento", apresentadorService.obterLista(usuario));

		return "apresentador/lista";
	}

	@PostMapping(value = "/apresentador/create")
	public String create(Apresentador apresentador,  @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		apresentador.setUsuario(usuario);
		
		apresentadorService.create(apresentador);

		return "redirect:/apresentadores";
	}
	
	@GetMapping(value = "/apresentador/{id}/delete")
	public String delete(@PathVariable Integer id) {
		
		apresentadorService.delete(id);		

		return "redirect:/apresentadores";
	}
}
