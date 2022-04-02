package com.devprojects.sistemaautenticacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devprojects.sistemaautenticacao.entities.Perfil;
import com.devprojects.sistemaautenticacao.entities.Permissao;
import com.devprojects.sistemaautenticacao.entities.enums.Entidade;
import com.devprojects.sistemaautenticacao.repositories.PerfilRepository;
import com.devprojects.sistemaautenticacao.repositories.PermissaoRepository;

@SpringBootApplication
public class SistemaAutenticacaoApplication implements CommandLineRunner {

	@Autowired
	private PerfilRepository perfilRepository;
		@Autowired
	private PermissaoRepository permissaoRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SistemaAutenticacaoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Perfil pfl1 = new Perfil(null, "Administrador");
		Perfil pfl2 = new Perfil(null, "Gerente");
		Perfil pfl3 = new Perfil(null, "Vendedor");
		Perfil pfl4 = new Perfil(null, "Cliente");
		
		//Perfil Administrador
		Permissao pms1 = new Permissao(null,Entidade.USUARIO,true,true,true,true,pfl1);
		Permissao pms2 = new Permissao(null,Entidade.PRODUTO,true,true,true,true,pfl1);
		Permissao pms3 = new Permissao(null,Entidade.CLIENTE,true,true,true,true,pfl1);
		Permissao pms4 = new Permissao(null,Entidade.FUNCIONARIO,true,true,true,true,pfl1);
		Permissao pms5 = new Permissao(null,Entidade.VENDA,true,true,true,true,pfl1);
		//Perfil Vendedor
		Permissao pms6 = new Permissao(null,Entidade.CLIENTE,true,true,true,false,pfl3);
		Permissao pms7 = new Permissao(null,Entidade.VENDA,true,true,false,false,pfl3);
		
		pfl1.getPermissoes().addAll(Arrays.asList(pms1,pms2,pms3,pms4,pms5));
		pfl3.getPermissoes().addAll(Arrays.asList(pms6,pms7));
				
		perfilRepository.saveAll(Arrays.asList(pfl1,pfl2,pfl3,pfl4));
		permissaoRepository.saveAll(Arrays.asList(pms1,pms2,pms3,pms4,pms5,pms6,pms7));

	}

}
