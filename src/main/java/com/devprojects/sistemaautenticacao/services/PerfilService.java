package com.devprojects.sistemaautenticacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devprojects.sistemaautenticacao.entities.Perfil;
import com.devprojects.sistemaautenticacao.repositories.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	private PerfilRepository repo;
	
	public Perfil Buscar(Integer id) {
		Optional<Perfil> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
