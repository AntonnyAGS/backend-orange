/** 
 * Author: Kenji
 * Project: Orange
 * Date: 30/10
 */
package br.com.orange.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.orange.domain.Categoria;
import br.com.orange.domain.Cliente;
import br.com.orange.domain.Produto;
import br.com.orange.domain.dto.ProdutoDTO;
import br.com.orange.domain.dto.ProdutoNewDTO;
import br.com.orange.repositories.ProdutoRepository;
import br.com.orange.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repository;
	
	// FIND ALL
	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	// FIND BY ID
	public Produto findById(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id));
	}
	
	// INSERT
	public Produto insert(Produto obj) {
		obj.setId(null);
		return repository.save(obj);
	}	
	
	// UPDATE
	public Produto update(Produto obj) {
		Produto newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}

	// DELETE
	public void delete(Integer id) {
		findById(id);
		try {
			repository.deleteById(id);
		} catch(DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("Não foi possível excluir");
		}
		
	}
	
	//METHOD'S
	public Produto fromDTO(ProdutoNewDTO objDTO) {
		Cliente cliente = new Cliente();
		cliente.setId(objDTO.getCliente_id());
		Categoria cat = new Categoria();
		cat.setId(objDTO.getCategoria_id());
		
		return new Produto(null, objDTO.getNome(), objDTO.getDescricao(), objDTO.getData(), objDTO.getPreco(), cliente, cat);
	}
	public Produto fromDTO(ProdutoDTO objDTO) {
		Cliente cliente = new Cliente();
		cliente.setId(objDTO.getCliente_id());
		Categoria cat = new Categoria();
		cat.setId(objDTO.getCategoria_id());
		
		return new Produto(null, objDTO.getNome(), objDTO.getDescricao(), null, objDTO.getPreco(), cliente, cat);
	}
	
	private void updateData(Produto newObj, Produto obj) {
		newObj.setNome(obj.getNome());
		newObj.setDescricao(obj.getDescricao());
		newObj.setPreco(obj.getPreco());
	}
	
	
	
}
