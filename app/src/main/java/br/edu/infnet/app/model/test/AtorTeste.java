package br.edu.infnet.app.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.app.model.domain.Ator;

public class AtorTeste {

	public static void main(String[] args) {
		
		Ator ato1 = new Ator("Nome do ator", "xpto", LocalDateTime.now(), 30000);
		ato1.setDescricao("Ator da novela Amor de Mãe");
		ato1.setPrograma("Amor de Mãe");
		ato1.setPersonagem("Zezinho");
		ato1.setDesconto(20);
		System.out.println(ato1);
		
		Ator ato2 = new Ator("Nome do ator", "xpto", LocalDateTime.now(), 30000);
		ato2.setDescricao("Ator da novela Amor de Mãe");
		ato2.setPrograma("Amor de Mãe");
		ato2.setPersonagem("Zezinho");
		ato2.setDesconto(20);	
		System.out.println("Salario = " + ato2.calcularSalario());

	}

}
