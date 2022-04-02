package com.devprojects.sistemaautenticacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devprojects.sistemaautenticacao.entities.Permissao;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Integer>{

	
}
