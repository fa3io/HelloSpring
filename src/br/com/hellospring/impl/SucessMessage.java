package br.com.hellospring.impl;

import br.com.hellospring.interfaces.Message;

public class SucessMessage implements Message {

	String nome;

	@Override
	public String getMessage() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
