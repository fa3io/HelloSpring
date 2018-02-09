package br.com.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hellospring.impl.ClienteDAO;
import br.com.hellospring.interfaces.Conexao;

public class MainConexao {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Conexao conexao = (Conexao) context.getBean("conexaoMySql");
		ClienteDAO clienteDao = (ClienteDAO) context.getBean("clienteDAO");
		
		System.out.println(conexao.getURLconection());
		System.out.println(clienteDao);


	}

}
