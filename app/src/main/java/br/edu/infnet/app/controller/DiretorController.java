package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.app.model.domain.Diretor;
import br.edu.infnet.app.model.service.DiretorService;

@Controller
public class DiretorController {

	@Autowired
	private DiretorService diretorService;

	@GetMapping(value = "/diretor")
	public String cadastro() {
		return "diretor/cadastro";
	}

	@GetMapping(value = "/diretores")
	public String lista(Model model) {

		model.addAttribute("listaTalento", diretorService.obterLista());

		return "diretor/lista";
	}

	@PostMapping(value = "/diretor/create")
	public String create(Diretor diretor) {

		diretorService.create(diretor);

		return "redirect:/diretores";
	}

	@GetMapping(value = "/diretor/{id}/delete")
	public String delete(@PathVariable Integer id) {

		diretorService.delete(id);

		return "redirect:/diretores";
	}

}
