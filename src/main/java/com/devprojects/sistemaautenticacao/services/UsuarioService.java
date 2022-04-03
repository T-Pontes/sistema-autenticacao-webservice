package com.devprojects.sistemaautenticacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devprojects.sistemaautenticacao.entities.Usuario;
import com.devprojects.sistemaautenticacao.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public Usuario Buscar(Integer id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
