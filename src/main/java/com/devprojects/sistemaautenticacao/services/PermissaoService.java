package com.devprojects.sistemaautenticacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devprojects.sistemaautenticacao.entities.Permissao;
import com.devprojects.sistemaautenticacao.repositories.PermissaoRepository;

@Service
public class PermissaoService {

	@Autowired
	private PermissaoRepository repo;
	
	public Permissao Buscar(Integer id) {
		Optional<Permissao> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
