package br.edu.infnet.app.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TbOportunidade")
public class Oportunidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean transporte;
	private boolean planoSaude;
	private boolean alimentacao;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	 @ManyToMany(cascade = CascadeType.DETACH)
	 private List<Talento> talentos;

	 @OneToOne(cascade = CascadeType.DETACH)
	 @JoinColumn(name = "idEmpresa")
	 private Empresa empresa;

	public Oportunidade() {
		data = LocalDateTime.now();
	}

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


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}
