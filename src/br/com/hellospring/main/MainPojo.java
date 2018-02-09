package br.com.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hellospring.pojo.Cliente;

public class MainPojo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Cliente cliente = (Cliente) context.getBean("cliente");
			
		System.out.println(cliente);
		
		

	}

}
