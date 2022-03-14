package br.edu.infnet.app.model.domain;

import java.time.LocalDateTime;

public abstract class Talento {

	private String nomeCompleto;
	private String nomeArtistico;
	private LocalDateTime dataNascimento;
	private float valor;

	public Talento(String nomeCompleto, String nomeArtistico, LocalDateTime dataNascimento, float valor) {
		this.nomeCompleto = nomeCompleto;
		this.nomeArtistico = nomeArtistico;
		this.dataNascimento = dataNascimento;
		this.valor = valor;
	}

	public abstract float calcularSalario();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nomeCompleto);
		sb.append(";");
		sb.append(nomeArtistico);
		sb.append(";");
		sb.append(dataNascimento);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(calcularSalario());
		
		return sb.toString();
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public float getValor() {
		return valor;
	}
	
}
