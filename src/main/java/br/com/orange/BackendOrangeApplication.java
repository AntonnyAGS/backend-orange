package br.com.orange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.orange.repositories.ProdutoRepository;

@SpringBootApplication
public class BackendOrangeApplication implements CommandLineRunner {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendOrangeApplication.class, args);
	}
	
	@Override
	public void run (String... args) {
		
		
	}
}
