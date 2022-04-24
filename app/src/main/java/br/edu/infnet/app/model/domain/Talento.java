package br.edu.infnet.app.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TbTalento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Talento {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeCompleto;
	private String nomeArtistico;
	private float valor;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;	
	
	@ManyToMany(mappedBy = "talentos")	
	private List<Oportunidade> oportunidades;
		

	public List<Oportunidade> getOportunidades() {
		return oportunidades;
	}

	public void setOportunidades(List<Oportunidade> oportunidades) {
		this.oportunidades = oportunidades;
	}

	public Talento() {
	}

	public Talento(String nomeCompleto, String nomeArtistico, float valor) {
		this.nomeCompleto = nomeCompleto;
		this.nomeArtistico = nomeArtistico;
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
		sb.append(valor);
		sb.append(";");
		sb.append(calcularSalario());
		
		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
