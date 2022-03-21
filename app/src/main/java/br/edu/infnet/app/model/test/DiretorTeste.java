package br.edu.infnet.app.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.app.model.domain.Diretor;

public class DiretorTeste {
	
public static void main(String[] args) {
		
		Diretor dir1 = new Diretor("Nome do ator", "xpto", LocalDateTime.now(), 40000);
		dir1.setDescricao("Diretor da novela Amor de Mãe");
		dir1.setDesconto(30);
		System.out.println(dir1);
		
		Diretor dir2 = new Diretor("Nome do ator", "xpto", LocalDateTime.now(), 40000);
		dir2.setDescricao("Diretor da novela Amor de Mãe");
		dir2.setDesconto(30);
		System.out.println(dir2);
		System.out.println("Salario = " + dir2.calcularSalario());

	}

}
