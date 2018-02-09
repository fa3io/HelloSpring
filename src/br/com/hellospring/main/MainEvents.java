package br.com.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hellospring.interfaces.UsuarioDAO;

public class MainEvents {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		UsuarioDAO usuarioDAO = (UsuarioDAO) context.getBean("usuarioDaoImpl");
		
		System.out.println(usuarioDAO);
		usuarioDAO.createUsuario("Fábio Santos Aves", "fabio.santos.alves@gmail.com");
	}

}
