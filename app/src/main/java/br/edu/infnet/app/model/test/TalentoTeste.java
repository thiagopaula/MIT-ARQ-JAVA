package br.edu.infnet.app.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.app.model.domain.Apresentador;
import br.edu.infnet.app.model.domain.Ator;
import br.edu.infnet.app.model.domain.Diretor;

public class TalentoTeste {
	
	public static void main(String[] args) {

		Apresentador apr = new Apresentador("Nome do apresentador", "xpto1", LocalDateTime.now(), 10000);
		apr.setDescricao("Apresenador do Domingão");
		apr.setDesconto(10);
		
		Ator ato = new Ator("Nome do Ator", "xpto2", LocalDateTime.now(), 15000);
		
		Diretor dir = new Diretor("Nome do Diretor", "xpto3", LocalDateTime.now(), 20000);
	}

}
