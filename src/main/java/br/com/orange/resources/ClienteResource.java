package br.com.orange.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.orange.domain.Cliente;
import br.com.orange.domain.dto.ClienteDTO;
import br.com.orange.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	ClienteService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id){
		Cliente obj = service.find(id);
		return ResponseEntity.ok(obj);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Cliente obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();	
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody ClienteDTO objDto, @PathVariable Integer id){
		
		Cliente obj = service.fromDTO(objDto);
		obj.setId(id);
		System.out.print(obj.getNome());
		service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
