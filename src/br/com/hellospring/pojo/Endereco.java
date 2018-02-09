package br.com.hellospring.pojo;

import org.springframework.stereotype.Component;

@Component("endereco")
public class Endereco {
	
	String Logradouro;
	String cep;
	
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
	return "Logradouro: " +this.Logradouro + "CEP: " +this.cep; 
	}
	
	
}
