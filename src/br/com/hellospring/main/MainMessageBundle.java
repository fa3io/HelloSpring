package br.com.hellospring.main;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMessageBundle {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		MessageSource messageSource = (MessageSource) context.getBean("messageResouce");
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(messageSource.getMessage("spring.pais", null, null));
		System.out.println(messageSource.getMessage("spring.saudacao", null, null));
		System.out.println(messageSource.getMessage("spring.idioma", null, null));
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(messageSource.getMessage("spring.pais", null, Locale.US));
		System.out.println(messageSource.getMessage("spring.saudacao", null, Locale.US));
		System.out.println(messageSource.getMessage("spring.idioma", null, Locale.US));
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(messageSource.getMessage("spring.pais", null, new Locale("es", "ES")));
		System.out.println(messageSource.getMessage("spring.saudacao", null, new Locale("es", "ES")));
		System.out.println(messageSource.getMessage("spring.idioma", null,  new Locale("es", "ES")));
		
	}

}
