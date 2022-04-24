package br.edu.infnet.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.app.model.domain.Oportunidade;
import br.edu.infnet.app.model.domain.Talento;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.EmpresaService;
import br.edu.infnet.app.model.service.OportunidadeService;
import br.edu.infnet.app.model.service.TalentoService;
@Controller
public class OportunidadeController {

	
	@Autowired
	private OportunidadeService oportunidadeService;
	@Autowired
	private EmpresaService empresaService;	
	@Autowired
	private TalentoService talentoService;
	
	@GetMapping(value = "/oportunidade")
	public String cadastro(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("listaEmpresas", empresaService.obterLista(usuario));
		model.addAttribute("listaTalentos", talentoService.obterLista(usuario));
		
		return "oportunidade/cadastro";
	}
	
	
	@GetMapping(value = "/oportunidades")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {

		model.addAttribute("listaOportunidade", oportunidadeService.obterLista(usuario));

		return "oportunidade/lista";
	}
	
	@PostMapping(value = "/oportunidade/create")
	public String create(Oportunidade oportunidade, @RequestParam String[] idsTalentos, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		List<Talento> talentos = new ArrayList<Talento>();
		
		for(String id : idsTalentos) {
			
			Talento talento = talentoService.obterById(Integer.valueOf(id));
			talentos.add(talento);
		}
		
		oportunidade.setUsuario(usuario);
		oportunidade.setTalentos(talentos);
		oportunidadeService.create(oportunidade);

		return "redirect:/oportunidades";
	}
	
	@GetMapping(value = "/oportunidade/{id}/delete")
	public String delete(@PathVariable Integer id) {
		
		oportunidadeService.delete(id);		

		return "redirect:/oportunidades";
	}
}
