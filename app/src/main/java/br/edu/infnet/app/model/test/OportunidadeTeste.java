package br.edu.infnet.app.model.test;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Ator;
import br.edu.infnet.app.model.domain.Diretor;
import br.edu.infnet.app.model.domain.Empresa;
import br.edu.infnet.app.model.domain.Oportunidade;
import br.edu.infnet.app.model.domain.Talento;

public class OportunidadeTeste {
	
	public static void main(String[] args) {
		
		Apresentador apr1 = new Apresentador("Nome do apresentador", "xpto1", 10000);
		apr1.setDescricao("Apresenador do Domingão");
		apr1.setDesconto(10);
		
		Ator ato1 = new Ator("Nome do ator", "xpto", 30000);
		ato1.setDescricao("Ator da novela Amor de Mãe");
		ato1.setPrograma("Amor de Mãe");
		ato1.setPersonagem("Zezinho");
		ato1.setDesconto(20);
		
		Diretor dir1 = new Diretor("Nome do ator", "xpto", 40000);
		dir1.setDescricao("Diretor da novela Amor de Mãe");
		dir1.setDesconto(30);
		
		List<Talento> talentos = new ArrayList<Talento>();
		talentos.add(apr1);
		talentos.add(ato1);
		talentos.add(dir1);
		
		Empresa empresa = new Empresa("Globo","29.118.096/0001-79", "teste@teste.com");
		
		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setDescricao("Primeira vaga");
		oportunidade.setTalentos(talentos);
		oportunidade.setEmpresa(empresa);		
		System.out.println(oportunidade);
	}

}
