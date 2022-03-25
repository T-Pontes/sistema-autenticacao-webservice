package com.devprojects.sistemaautenticacao.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devprojects.sistemaautenticacao.entities.Perfil;

@RestController
@RequestMapping(value = "/perfis")
public class PerfilResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Perfil> listar() {
		Perfil p1 = new Perfil(1L, "Cliente");
		Perfil p2 = new Perfil(2L, "Funcionario");
		List<Perfil> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		return lista;
	}
}
