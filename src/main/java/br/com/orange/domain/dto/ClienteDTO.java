/** 
 * Author: Antonny
 * Project: Orange
 * Date: 29/10
 */

package br.com.orange.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import br.com.orange.domain.Cliente;
import br.com.orange.services.validation.ClienteUpdate;

@ClienteUpdate
public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="O nome deve ter entre 4 e 20 caracteres.")
	@Email(message="Digite um email válido")
	private String email;
	
	@NotEmpty(message="O nome deve ter entre 4 e 20 caracteres.")
	private String nome;
	
	@NotEmpty(message="A cidade deve ter entre 4 e 20 caracteres.")
	private String cidade;
	
	@NotEmpty(message="O telefone deve ter entre 4 e 20 caracteres.")
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
