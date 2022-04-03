package com.devprojects.sistemaautenticacao;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devprojects.sistemaautenticacao.entities.Perfil;
import com.devprojects.sistemaautenticacao.entities.Permissao;
import com.devprojects.sistemaautenticacao.entities.Pessoa;
import com.devprojects.sistemaautenticacao.entities.Usuario;
import com.devprojects.sistemaautenticacao.repositories.PerfilRepository;
import com.devprojects.sistemaautenticacao.repositories.PermissaoRepository;
import com.devprojects.sistemaautenticacao.repositories.PessoaRepository;
import com.devprojects.sistemaautenticacao.repositories.UsuarioRepository;

@SpringBootApplication
public class SistemaAutenticacaoApplication implements CommandLineRunner {

	@Autowired
	private PerfilRepository perfilRepository;
	@Autowired
	private PermissaoRepository permissaoRepository;
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {

		SpringApplication.run(SistemaAutenticacaoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// Perfis
		Perfil pfl1 = new Perfil(null, "Administrador");
		Perfil pfl2 = new Perfil(null, "Gerente");
		Perfil pfl3 = new Perfil(null, "Vendedor");
		Perfil pfl4 = new Perfil(null, "Cliente");

		// Permissoes Administrador
		Permissao pms1 = new Permissao(null, 1, true, true, true, true, pfl1);
		Permissao pms2 = new Permissao(null, 2, true, true, true, true, pfl1);
		Permissao pms3 = new Permissao(null, 3, true, true, true, true, pfl1);
		Permissao pms4 = new Permissao(null, 4, true, true, true, true, pfl1);
		Permissao pms5 = new Permissao(null, 5, true, true, true, true, pfl1);
		// Permissoes Vendedor
		Permissao pms6 = new Permissao(null, 2, true, true, true, false, pfl3);
		Permissao pms7 = new Permissao(null, 5, true, true, false, false, pfl3);

		pfl1.getPermissoes().addAll(Arrays.asList(pms1, pms2, pms3, pms4, pms5));
		pfl3.getPermissoes().addAll(Arrays.asList(pms6, pms7));

		perfilRepository.saveAll(Arrays.asList(pfl1, pfl2, pfl3, pfl4));
		permissaoRepository.saveAll(Arrays.asList(pms1, pms2, pms3, pms4, pms5, pms6, pms7));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		//Pessoas
		Pessoa p1 = new Pessoa(null, "Tiago de Pontes Lima", sdf.parse("02/11/1988 00:00"), "00485096200");
		Pessoa p2 = new Pessoa(null, "Arthur Costa de Pontes", sdf.parse("07/12/2019 00:00"), "00180090070");
		Pessoa p3 = new Pessoa(null, "Keylla Jose de Nazaré Costa", sdf.parse("07/02/1983 00:00"), "82275420234");
		
		//Usuarios
		Usuario u1 = new Usuario(null,"tiagopontes10@gmail.com","TpKj2212",p1);
		Usuario u2 = new Usuario(null,"tiagopontes10@gmail.com","Arthur0712",p2);
		Usuario u3 = new Usuario(null,"tiagopontes10@gmail.com","030513",p3);

		p1.setUsuario(u1);
		p2.setUsuario(u2);
		p3.setUsuario(u3);
		
		u1.getPerfis().addAll(Arrays.asList(pfl1, pfl2, pfl3, pfl4));
		u2.getPerfis().addAll(Arrays.asList(pfl2,pfl4));
		u3.getPerfis().addAll(Arrays.asList(pfl4));
		
		pessoaRepository.saveAll(Arrays.asList(p1,p2,p3));
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3));
	}

}
