package br.com.orange;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.orange.domain.Produto;
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
		
		Produto p1 = new Produto(null, "Laranja", "A melhor laranja da região", new Date(), 1.00);
		Produto p2 = new Produto(null, "Pimentão", "O melhor pimentão da região", new Date(), 10.00);
		Produto p3 = new Produto(null, "Limão", "O melhor limão da região", new Date(), 0.50);
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
	}
}
