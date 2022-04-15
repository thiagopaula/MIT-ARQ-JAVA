package br.edu.infnet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.app.model.domain.Oportunidade;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.OportunidadeService;
@Controller
public class OportunidadeController {

	
	@Autowired
	private OportunidadeService oportunidadeService;
	
	
	@GetMapping(value = "/oportunidade")
	public String cadastro() {
		return "oportunidade/cadastro";
	}
	
	
	@GetMapping(value = "/oportunidades")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {

		model.addAttribute("listaOportunidade", oportunidadeService.obterLista(usuario));

		return "oportunidade/lista";
	}
	
	@PostMapping(value = "/oportunidade/create")
	public String create(Oportunidade oportunidade, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		oportunidade.setUsuario(usuario);
		oportunidadeService.create(oportunidade);

		return "redirect:/oportunidades";
	}
	
	@GetMapping(value = "/oportunidade/{id}/delete")
	public String delete(@PathVariable Integer id) {
		
	//	oportunidadeService.delete(id);		

		return "redirect:/oportunidades";
	}
}
