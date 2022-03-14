package br.edu.infnet.app.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Oportunidade {
	
	private String descricao;
	private LocalDateTime data;
	
	private List<Talento> talentos;
	private Empresa empresa;
	
	public Oportunidade() {
		data = LocalDateTime.now();
		descricao = "Primeira vaga";
	}

	@Override
	public String toString() {		
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
		return	String.format("%s; %s;%d", 
				descricao, 
				data.format(formato),
				talentos.size());
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Talento> getTalentos() {
		return talentos;
	}

	public void setTalentos(List<Talento> talentos) {
		this.talentos = talentos;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public LocalDateTime getData() {
		return data;
	}
}
