package br.edu.infnet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.app.model.domain.Oportunidade;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.OportunidadeService;

@Order(3)
@Component
public class OportunidadeLoader implements ApplicationRunner {

	@Autowired
	private OportunidadeService oportunidadeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setDescricao("Vaga de programador"); 
		oportunidade.setAlimentacao(true);
		oportunidade.setPlanoSaude(true);
		oportunidade.setTransporte(true);
		oportunidade.setUsuario(usuario);		

		oportunidadeService.create(oportunidade);
	
	}

}
