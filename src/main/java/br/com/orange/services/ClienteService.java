package br.com.orange.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.orange.domain.Cliente;
import br.com.orange.domain.dto.ClienteDTO;
import br.com.orange.repositories.ClienteRepository;
import br.com.orange.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	// FIND ONE BY ID
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
	// FIND ALL 
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	//INSERT 
	public Cliente insert(Cliente obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	//UPDATE
	public Cliente update(Cliente obj) {
		Cliente newObj = find(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}
	
	//METHOD'S 
	public Cliente fromDTO(ClienteDTO objDto) {
		return new Cliente(null, objDto.getNome(), objDto.getEmail(), null, objDto.getCidade(), objDto.getTelefone(), null, null);
	}
	
	private void updateData(Cliente newObj, Cliente obj) {
		newObj.setNome(obj.getNome());
		newObj.setEmail(obj.getEmail());
		newObj.setCidade(obj.getCidade());
		newObj.setTelefone(obj.getTelefone());
	}
}
