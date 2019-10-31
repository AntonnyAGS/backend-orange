/** 
 * Author: Antonny
 * Project: Orange
 * Date: 29/10
 */

package br.com.orange.domain.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.orange.services.validation.ClienteInsert;


@ClienteInsert
public class ClienteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	@NotEmpty(message="O nome deve ter entre 4 e 20 caracteres.")
	private String nome;
	
	@Email(message="Insira um email válido.")
	@Column(unique = true)
	private String email;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dtNascimento;
	private String cidade;
	private String telefone;
	private String cpfOuCnpj;
	private Integer tipoCliente;
	
	//CONSTRUCTOR'S
	public ClienteNewDTO() {}
	
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

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
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

	public Integer getTipoCliente() {
		return this.tipoCliente;
	}

	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}
