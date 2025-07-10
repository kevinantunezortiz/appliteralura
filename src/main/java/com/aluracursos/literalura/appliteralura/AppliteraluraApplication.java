package com.aluracursos.literalura.appliteralura;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aluracursos.literalura.appliteralura.principal.Principal;

@SpringBootApplication
public class AppliteraluraApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(AppliteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.mostrarMenú();
	}

}
