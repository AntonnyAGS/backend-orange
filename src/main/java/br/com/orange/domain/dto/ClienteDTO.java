package br.com.orange.domain.dto;

import java.io.Serializable;

import br.com.orange.domain.Cliente;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String email;
	private String nome;
	private String cidade;
	private String telefone;
	
	//CONSTRUCTOR
	public ClienteDTO() {}

	public ClienteDTO(Cliente obj) {
		this.id = obj.getId();
		this.email = obj.getEmail();
		this.nome = obj.getNome();
		this.cidade = obj.getCidade();
		this.telefone = obj.getTelefone();
	}

	//GETTER'S AND SETTER'S
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
