package br.com.orange.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.orange.domain.Produto;

public class ProdutoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "O campo não pode ser vazio")
	private String nome;
	
	@NotEmpty(message = "O campo não pode ser vazio")
	private String descricao;
	
	@NotNull(message = "O campo não pode ser vazio")
	private Double preco;
	 
	
	private Integer cliente_id;
	
	private Integer categoria_id;

	
	
	//CONSTRUCTOR'S
	public ProdutoDTO() {
	}
	
	public ProdutoDTO(Produto obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
		this.preco = obj.getPreco();
		this.cliente_id = obj.getCliente().getId();
		this.setCategoria_id(obj.getCategoria().getId());
	}
	
	//GET'S AND SETTER'S
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Integer getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Integer categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	
}
