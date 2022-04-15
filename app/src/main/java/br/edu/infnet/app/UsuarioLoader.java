package br.edu.infnet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader  implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String email = "thiago@teste.com";
		String senha = "123456";
		
		if(usuarioService.validar(email, senha) == null) {
		
			Usuario usuario = new Usuario();
			usuario.setAdmin(true);
			usuario.setEmail(email);
			usuario.setNome("Thiago de Paula");
			usuario.setSenha(senha);

			usuarioService.create(usuario);
			
		}
	}

}
