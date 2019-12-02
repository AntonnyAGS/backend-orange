package br.com.orange.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.orange.domain.Categoria;
import br.com.orange.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaService service;
			
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> lista =  service.findAll();
		return ResponseEntity.ok(lista);
	}
}
