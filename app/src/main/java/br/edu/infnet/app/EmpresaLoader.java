package br.edu.infnet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.domain.Usuario;
import br.edu.infnet.app.model.service.EmpresaService;
import br.edu.infnet.app.model.service.UsuarioService;

@Component
public class EmpresaLoader implements ApplicationRunner {

	@Autowired
	private EmpresaService empresaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Empresa empresa = new Empresa();

		empresa.setNome("xpto");
		empresa.setEmail("teste@teste.com");
		empresa.setCnpj("38.102.530/5353-00");

		empresaService.create(empresa);
	
	}

}
