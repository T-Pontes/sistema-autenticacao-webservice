package com.devprojects.sistemaautenticacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devprojects.sistemaautenticacao.entities.Perfil;
import com.devprojects.sistemaautenticacao.services.PerfilService;

@RestController
@RequestMapping(value = "/perfis")
public class PerfilResource {

	@Autowired
	private PerfilService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Perfil obj = service.Buscar(id);
		return ResponseEntity.ok().body(obj);

	}
}
