package br.edu.infnet.app.model.test;

import br.edu.infnet.app.model.domain.Apresentador;

public class ApresentadorTeste {

	public static void main(String[] args) {
	
		
		Apresentador apr1 = new Apresentador("Nome do apresentador", "xpto1", 10000);
		apr1.setDescricao("Apresenador do Domingão");
		apr1.setDesconto(10);
		System.out.println(apr1);
		
		Apresentador apr2 = new Apresentador("Nome do apresentador", "xpto1", 10000);
		apr2.setDescricao("Apresenador do Domingão");
		apr2.setDesconto(10);		
		System.out.println("Salario = " + apr2.calcularSalario());

	}

}
