package br.edu.infnet.app.model.domain;

import java.time.LocalDateTime;

public class Diretor extends Talento  {
	
	private String descricao;
	private float desconto;

	public Diretor(String nomeCompleto, String nomeArtistico, LocalDateTime dataNascimento, float valor) {
		super(nomeCompleto, nomeArtistico, dataNascimento, valor);
	}

	@Override
	public float calcularSalario() {
		return getValor() - desconto * 65;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());		
		sb.append(";");
		sb.append(descricao);
		sb.append(";");
		sb.append(";");
		sb.append(desconto);
		
		return sb.toString();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
}
