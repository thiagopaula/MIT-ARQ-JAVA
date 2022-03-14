package br.edu.infnet.app.model.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.domain.Oportunidade;
import br.edu.infnet.app.model.domain.Talento;

public class OportunidadeTeste {
	
	public static void main(String[] args) {
		
		Apresentador apr1 = new Apresentador("Nome do apresentador", "xpto1", LocalDateTime.now(), 10000);
		apr1.setDescricao("Apresenador do Domingão");
		apr1.setDesconto(10);
		
		Apresentador apr2 = new Apresentador("Nome do apresentador", "xpto2", LocalDateTime.now(), 5000);
		apr2.setDescricao("Apresenador do Fantastico");
		apr2.setDesconto(10);
		
		List<Talento> talentos = new ArrayList<Talento>();
		talentos.add(apr1);
		talentos.add(apr2);
		
		Empresa empresa = new Empresa("Globo","", "teste@teste.com");
		
		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setDescricao("Primeira vaga");
		oportunidade.setTalentos(talentos);
		oportunidade.setEmpresa(empresa);		
		System.out.println(oportunidade);
	}

}
