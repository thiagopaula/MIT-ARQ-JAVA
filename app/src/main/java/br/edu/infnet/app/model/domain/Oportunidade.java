package br.edu.infnet.app.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Oportunidade {

	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean transporte;
	private boolean planoSaude;
	private boolean alimentacao;

	private List<Talento> talentos;
	private Empresa empresa;

	public Oportunidade(String descricao, boolean transporte, boolean planoSaude, boolean alimentacao) {
		data = LocalDateTime.now();
		this.descricao = descricao;
		this.transporte = transporte;
		this.planoSaude = planoSaude;
		this.alimentacao = alimentacao;
	}

	@Override
	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		return String.format("%s; %s;%d; %s; %s; %s", descricao, data.format(formato), talentos.size(),
				transporte ? "Sim" : "Não", planoSaude ? "Sim" : "Não", alimentacao ? "Sim" : "Não");
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

	public boolean isTransporte() {
		return transporte;
	}

	public void setTransporte(boolean transporte) {
		this.transporte = transporte;
	}

	public boolean isPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}

	public boolean isAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(boolean alimentacao) {
		this.alimentacao = alimentacao;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
