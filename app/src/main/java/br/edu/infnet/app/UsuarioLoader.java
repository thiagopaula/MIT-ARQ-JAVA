package br.edu.infnet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.UsuarioService;

@Component
public class UsuarioLoader  implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();

		usuario.setAdmin(true);
		usuario.setEmail("thiago@teste.com");
		usuario.setNome("Thiago de Paula");
		usuario.setSenha("123456");

		usuarioService.create(usuario);
		
	}

}
