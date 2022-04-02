package com.devprojects.sistemaautenticacao.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devprojects.sistemaautenticacao.entities.enums.Entidade;

@Entity
public class Permissao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer entidade;
	private Boolean pesquisa;
	private Boolean inclusao;
	private Boolean atualizacao;
	private Boolean delecao;

	@ManyToOne
	@JoinColumn(name = "perfil_id")
	private Perfil perfil;

	public Permissao() {
	}

	public Permissao(Integer id, Integer entidade, Boolean pesquisa, Boolean inclusao, Boolean atualizacao, Boolean delecao,
			Perfil perfil) {
		super();
		this.id = id;
		this.entidade = entidade;
		this.pesquisa = pesquisa;
		this.inclusao = inclusao;
		this.atualizacao = atualizacao;
		this.delecao = delecao;
		this.perfil = perfil;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Entidade getEntidade() {
		return Entidade.toEnum(entidade);
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade.getId();
	}

	public Boolean getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(Boolean pesquisa) {
		this.pesquisa = pesquisa;
	}

	public Boolean getInclusao() {
		return inclusao;
	}

	public void setInclusao(Boolean inclusao) {
		this.inclusao = inclusao;
	}

	public Boolean getAtualizacao() {
		return atualizacao;
	}

	public void setAtualizacao(Boolean atualizacao) {
		this.atualizacao = atualizacao;
	}

	public Boolean getDelecao() {
		return delecao;
	}

	public void setDelecao(Boolean delecao) {
		this.delecao = delecao;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Permissao other = (Permissao) obj;
		return Objects.equals(id, other.id);
	}

}
