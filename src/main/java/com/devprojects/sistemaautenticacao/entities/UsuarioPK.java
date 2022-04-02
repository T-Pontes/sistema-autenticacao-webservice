package com.devprojects.sistemaautenticacao.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Embeddable
public class UsuarioPK implements Serializable{
	static final long serialVersionUID = 1L;
	
	@OneToOne
	@JoinColumn(name="pessoa_id")
	@MapsId
	private Pessoa pessoa;
	
	private Perfil perfil;
		
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		return Objects.hash(perfil, pessoa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioPK other = (UsuarioPK) obj;
		return Objects.equals(perfil, other.perfil) && Objects.equals(pessoa, other.pessoa);
	}
	
}
