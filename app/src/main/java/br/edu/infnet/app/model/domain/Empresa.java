package br.edu.infnet.app.model.domain;

public class Empresa {

	private String nome;
	private String cnpj;
	private String email;	
	
	public Empresa(String nome, String cnpj, String email) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(cnpj);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getEmail() {
		return email;
	}
	
}
