package com.devprojects.sistemaautenticacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devprojects.sistemaautenticacao.entities.Permissao;
import com.devprojects.sistemaautenticacao.services.PermissaoService;

@RestController
@RequestMapping(value = "/permissoes")
public class PermissaoResource {

	@Autowired
	private PermissaoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Permissao obj = service.Buscar(id);
		return ResponseEntity.ok().body(obj);

	}
}
