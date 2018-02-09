package br.com.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hellospring.interfaces.UsuarioService;

public class MainAOP {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UsuarioService usuarioService = (UsuarioService) context.getBean("UsuarioService");

		//usuarioService.updateUsuario();
		
		
		try {
			usuarioService.crateUsuario();
		} catch (Exception e) {
		}
		usuarioService.crateUsuario("Fábio Santos");
		 
	}
}
