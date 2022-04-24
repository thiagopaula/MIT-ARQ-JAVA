package br.edu.infnet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Ator;
import br.edu.infnet.app.model.domain.Diretor;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.ApresentadorService;
import br.edu.infnet.app.model.service.AtorService;
import br.edu.infnet.app.model.service.DiretorService;

@Order(2)
@Component
public class TalentoLoader implements ApplicationRunner {

	@Autowired
	private ApresentadorService apresentadorService;
	
	@Autowired
	private AtorService atorService;
	
	@Autowired
	private DiretorService diretorService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);

		//Apresentador
		Apresentador apresentador = new Apresentador();
		apresentador.setNomeArtistico("Apresentador XPTO");
		apresentador.setNomeCompleto("José Gonçalves");
		apresentador.setPrograma("Sabado Legal");
		apresentador.setDescricao("Apresentador de programa");
		apresentador.setValor(1000);
		apresentador.setDesconto(10);
		apresentador.setUsuario(usuario);
		
		apresentadorService.create(apresentador);

		//Ator
		Ator ator = new Ator();
		ator.setNomeArtistico("Ator XPTO");
		ator.setNomeCompleto("Carlos Souza");
		ator.setPersonagem("Zezinho");
		ator.setPrograma("Sonho Meu");
		ator.setDescricao("Ator de novela");
		ator.setValor(2000);
		ator.setDesconto(10);
		ator.setUsuario(usuario);

		atorService.create(ator);
		
		//Ator
		Diretor diretor = new Diretor();
		diretor.setNomeArtistico("Diretor XPTO");
		diretor.setNomeCompleto("Walcyr");
		diretor.setCadeira("Produtor");
		diretor.setPrograma("Pantanal");
		diretor.setDescricao("Diretor e produtor");
		diretor.setValor(10000);
		diretor.setDesconto(10);
		diretor.setUsuario(usuario);

		diretorService.create(diretor);

	}

}
