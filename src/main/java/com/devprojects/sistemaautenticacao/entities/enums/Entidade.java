package com.devprojects.sistemaautenticacao.entities.enums;

public enum Entidade {

	USUARIO(1, "Usuario"),
	CLIENTE(2, "Cliente"),
	FUNCIONARIO(3, "Funcionario"),
	PRODUTO(4, "Produto"),
	VENDA(5, "Venda");

	private Integer id;
	private String descricao;

	private Entidade(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Entidade toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (Entidade x : Entidade.values()) {
			if (id.equals(x.getId())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
