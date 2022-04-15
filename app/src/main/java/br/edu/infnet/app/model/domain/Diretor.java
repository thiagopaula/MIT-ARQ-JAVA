package br.edu.infnet.app.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TbDiretor")
public class Diretor extends Talento  {
	
	private String descricao;
	private String programa;
	private String cadeira;
	private float desconto;
	
	public Diretor() {
	}

	public Diretor(String nomeCompleto, String nomeArtistico, float valor) {
		super(nomeCompleto, nomeArtistico, valor);
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
		sb.append(programa);
		sb.append(";");
		sb.append(cadeira);
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

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getCadeira() {
		return cadeira;
	}

	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}
		
}
