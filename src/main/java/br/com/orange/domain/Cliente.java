/** 
 * Author: Antonny
 * Project: Orange
 * Date: 29/10
 */

package br.com.orange.domain;

import java.io.Serializable;

public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;
	private String dtNascimento;
	private String cidade;
	private String telefone;
	private String cpfOuCnpj;
	private int tipoCliente;
	
	//CONSTRUCTOR'S
	public Cliente() {}
	
	public Cliente(Integer id, String nome, String email, String dtNascimento, String cidade, String telefone,
			String cpfOuCnpj, int tipoCliente) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.cidade = cidade;
		this.telefone = telefone;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipoCliente = tipoCliente;
	}

	//GETTER'S AND SETTER'S
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
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

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public int getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(int tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	//HASH CODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
