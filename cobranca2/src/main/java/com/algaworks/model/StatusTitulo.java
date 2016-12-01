package com.algaworks.model;

public enum StatusTitulo {

	RECEBIDO("Recebido"),
	PENDENTE("Pendente"),
	CANCELADO("Cancelado");
	
	StatusTitulo(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}
}
