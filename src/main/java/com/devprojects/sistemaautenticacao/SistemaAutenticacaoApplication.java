package com.devprojects.sistemaautenticacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devprojects.sistemaautenticacao.entities.Perfil;
import com.devprojects.sistemaautenticacao.repositories.PerfilRepository;

@SpringBootApplication
public class SistemaAutenticacaoApplication implements CommandLineRunner {

	@Autowired
	private PerfilRepository perfilRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SistemaAutenticacaoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Perfil p1 = new Perfil(null, "Administrador");
		Perfil p2 = new Perfil(null, "Gerente");
		Perfil p3 = new Perfil(null, "Vendedr");
		Perfil p4 = new Perfil(null, "Cliente");
		
		perfilRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
	}

}
