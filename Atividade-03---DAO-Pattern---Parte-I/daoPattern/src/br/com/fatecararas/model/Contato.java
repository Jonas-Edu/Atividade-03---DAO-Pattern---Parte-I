package br.com.fatecararas.model;

public class Contato {

	private String nome, apelido, email, telefone, and, end, empresa, observações;

	public Contato(String nome, String apelido, String email, String telefone, String and, String end, String empresa,
			String observações) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.email = email;
		this.telefone = telefone;
		this.and = and;
		this.end = end;
		this.empresa = empresa;
		this.observações = observações;
	}
	
	public Contato() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getAnd() {
		return and;
	}

	public void setAnd(String and) {
		this.and = and;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getObservações() {
		return observações;
	}

	public void setObservações(String observações) {
		this.observações = observações;
	}
	
}