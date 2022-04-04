package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.app.model.domain.Ator;
import br.edu.infnet.app.model.service.AtorService;

@Controller
public class AtorController {
	
	@Autowired
	private AtorService atorService;
	
	
	@GetMapping(value = "/ator")
	public String cadastro() {
		return "ator/cadastro";
	}
	
	
	@GetMapping(value = "/atores")
	public String lista(Model model) {

		model.addAttribute("listaTalento", atorService.obterLista());

		return "ator/lista";
	}

	@PostMapping(value = "/ator/create")
	public String create(Ator ator) {
		
		atorService.create(ator);

		return "redirect:/atores";
	}
	
	@GetMapping(value = "/ator/{id}/delete")
	public String delete(@PathVariable Integer id) {
		
		atorService.delete(id);		

		return "redirect:/atores";
	}

}
