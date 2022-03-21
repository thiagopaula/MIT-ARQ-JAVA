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
		
		Ator ato1 = new Ator("Nome do ator", "xpto", LocalDateTime.now(), 30000);
		ato1.setDescricao("Ator da novela Amor de Mãe");
		ato1.setPrograma("Amor de Mãe");
		ato1.setPersonagem("Zezinho");
		ato1.setDesconto(20);
		
		Diretor dir1 = new Diretor("Nome do ator", "xpto", LocalDateTime.now(), 40000);
		dir1.setDescricao("Diretor da novela Amor de Mãe");
		dir1.setDesconto(30);
	}

}
