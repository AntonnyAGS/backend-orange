package br.com.orange;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.orange.domain.Cliente;
import br.com.orange.domain.enums.TipoCliente;
import br.com.orange.repositories.ClienteRepository;

@SpringBootApplication
public class BackendOrangeApplication implements CommandLineRunner {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendOrangeApplication.class, args);
	}
	
	@Override
	public void run (String... args) throws Exception {
		/* CLIENTE TESTE */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente c1 = new Cliente(null, "Antonny", "antonny@gmail.com", sdf.parse("18/02/2000"), "Guarulhos", "11959414462", "43697600893", 
				TipoCliente.PESSOAFISICA);
		Cliente c2 = new Cliente(null, "Studio", "studio@gmail.com", null, "Guarulhos", "11959414462", "4569426", 
				TipoCliente.PESSOAJURIDICA);
		
		clienteRepository.saveAll(Arrays.asList(c1, c2));
		/* ----------------- */
		
	}
}
