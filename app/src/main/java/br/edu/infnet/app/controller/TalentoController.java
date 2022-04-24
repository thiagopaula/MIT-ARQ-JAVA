package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.TalentoService;
@Controller
public class TalentoController {

	@Autowired
	private TalentoService talentoService;
	
	@GetMapping(value = "/talentos")
	public String lista(Model model,  @SessionAttribute("usuarioLogado") Usuario usuario) {

		model.addAttribute("listaTalento", talentoService.obterLista(usuario));

		return "talento/lista";
	}	

	
	@GetMapping(value = "/talento/{id}/delete")
	public String delete(@PathVariable Integer id) {
		
		talentoService.delete(id);		

		return "redirect:/talentos";
	}
}
