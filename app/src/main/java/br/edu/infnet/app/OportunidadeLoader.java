package br.edu.infnet.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.domain.Oportunidade;
import br.edu.infnet.app.model.domain.Talento;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.EmpresaService;
import br.edu.infnet.app.model.service.OportunidadeService;
import br.edu.infnet.app.model.service.TalentoService;

@Order(4)
@Component
public class OportunidadeLoader implements ApplicationRunner {

	@Autowired
	private OportunidadeService oportunidadeService;
	@Autowired
	private TalentoService talentoService;
	@Autowired
	private EmpresaService empresaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);

		// Lista de talentos
		List<Talento> talentos = (List<Talento>) talentoService.obterLista(usuario);

		// Empresa
		List<Empresa> empresas = (List<Empresa>) empresaService.obterLista(usuario);

		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setDescricao("Vaga de programador");
		oportunidade.setAlimentacao(true);
		oportunidade.setPlanoSaude(true);
		oportunidade.setTransporte(true);
		oportunidade.setUsuario(usuario);
		oportunidade.setTalentos(talentos);
		oportunidade.setEmpresa(empresas.get(0));

		oportunidadeService.create(oportunidade);

	}

}
