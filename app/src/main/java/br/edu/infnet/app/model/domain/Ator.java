package br.edu.infnet.app.model.domain;

import java.time.LocalDateTime;

public class Ator extends Talento  {

	public Ator(String nomeCompleto, String nomeArtistico, LocalDateTime dataNascimento, float valor) {
		super(nomeCompleto, nomeArtistico, dataNascimento, valor);
	}

	@Override
	public float calcularSalario() {
		return 0;
	}

}
