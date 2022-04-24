package br.edu.infnet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.EmpresaService;

@Order(3)
@Component
public class EmpresaLoader implements ApplicationRunner {

	@Autowired
	private EmpresaService empresaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Empresa empresa = new Empresa();
		empresa.setNome("xpto");
		empresa.setEmail("teste@teste.com");
		empresa.setCnpj("38.102.530/5353-00");
		
		empresa.setUsuario(usuario);

		empresaService.create(empresa);
	
	}

}
