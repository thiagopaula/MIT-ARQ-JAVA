package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.service.EmpresaService;


@Controller
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;

	
	@GetMapping(value = "/empresa")
	public String cadastro() {
		return "empresa/cadastro";
	}

	@GetMapping(value = "/empresas")
	public String lista(Model model) {

		model.addAttribute("listaEmpresa", empresaService.obterLista());

		return "empresa/lista";
	}

	@PostMapping(value = "/empresa/create")
	public String create(Empresa empresa) {
		
		empresaService.create(empresa);

		return "redirect:/empresas";
	}
	
	@GetMapping(value = "/empresa/{id}/delete")
	public String delete(@PathVariable Integer id) {
		
		empresaService.delete(id);		

		return "redirect:/empresas";
	}
}
