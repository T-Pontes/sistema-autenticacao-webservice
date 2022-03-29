package com.devprojects.sistemaautenticacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devprojects.sistemaautenticacao.entities.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer>{

	
}
