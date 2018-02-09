package br.com.hellospring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.hellospring.interfaces.Conexao;
import br.com.hellospring.interfaces.DAO;

public class ClienteDAO implements DAO {
	
	@Autowired
	@Qualifier("conexaoOracle")
	private Conexao conexao;
	
	//@PostConstruct
	public void initDao(){
		System.out.println("Iniciando DAO cliente!");
	}
	
	@Override
	public String toString() {
		return "ClienteDAO : Conexão: "+ conexao.getURLconection();  
	}
}
