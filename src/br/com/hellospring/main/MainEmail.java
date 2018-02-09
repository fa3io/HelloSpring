package br.com.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hellospring.interfaces.Message;

public class MainEmail {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Message message = (Message) context.getBean("emailMassege");
		System.out.println(message.getMessage());
	}

}
