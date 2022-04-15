package br.edu.infnet.app.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TbApresentador")
public class Apresentador extends Talento {


	private String descricao;
	private String programa;
	private float desconto;
	
	public Apresentador() {
	}
	
	public Apresentador(String nomeCompleto, String nomeArtistico, float valor) {
		super(nomeCompleto, nomeArtistico, valor);
	}

	@Override
	public float calcularSalario() {
		return getValor() - desconto * 10;
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
	
}
