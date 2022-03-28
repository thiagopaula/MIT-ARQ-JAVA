package br.edu.infnet.app.model.domain;



public abstract class Talento {

	private Integer id;
	private String nomeCompleto;
	private String nomeArtistico;
	private float valor;

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

	
}
