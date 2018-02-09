package br.com.hellospring.impl;

import br.com.hellospring.interfaces.Conexao;

public class ConexaoImpl implements Conexao {

	private String banco;
	private String url;
	private String porta;
	private String base;
	private String usuario;
	private String senha;

	@Override
	public String getURLconection() {
		return "jdbc:" + banco + "://" + url + ":" + porta + "/" + base + "?user=" + usuario + ";password=" + senha;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
