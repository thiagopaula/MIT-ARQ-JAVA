package br.edu.infnet.app.model.domain;

import java.time.LocalDateTime;

public class Ator extends Talento {

	private String descricao;
	private String programa;
	private String personagem;
	private float desconto;

	public Ator(String nomeCompleto, String nomeArtistico, LocalDateTime dataNascimento, float valor) {
		super(nomeCompleto, nomeArtistico, dataNascimento, valor);
	}

	@Override
	public float calcularSalario() {
		return getValor() - desconto * 35;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append(";");
		sb.append(descricao);
		sb.append(";");
		sb.append(programa);
		sb.append(";");
		sb.append(personagem);
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

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

}
