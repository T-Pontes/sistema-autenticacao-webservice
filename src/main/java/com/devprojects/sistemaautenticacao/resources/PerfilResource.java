package com.devprojects.sistemaautenticacao.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/perfis")
public class PerfilResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando";
	}
}
