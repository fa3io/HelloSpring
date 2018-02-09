package br.com.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hellospring.jdbc.JdbcTemplateUsuarioDaoImpl;
import br.com.hellospring.jdbc.Usuario;

public class MainJDBC {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		JdbcTemplateUsuarioDaoImpl dao =   (JdbcTemplateUsuarioDaoImpl) context.getBean("usuarioDao");
		
		System.out.println(dao.findAllUsuarios());
		System.out.println("--------------------------------------------------------");
		Usuario iago = new Usuario(null, "Iago", "iaguito@gmail.com");
		iago.setId(dao.createUsuario(iago));
		System.out.println(dao.findAllUsuarios());
		System.out.println("--------------------------------------------------------");
		iago.setNome("Iaguito");
		dao.updateUsuario(iago);
		System.out.println(dao.findAllUsuarios());
		System.out.println("--------------------------------------------------------");
		System.out.println(dao.findUsuarioById(3));
		System.out.println("--------------------------------------------------------");
		System.out.println(dao.findUsuariosByName("Luiz"));
		System.out.println("--------------------------------------------------------");
		dao.deleteUsuario(iago.getId());
		System.out.println(dao.findAllUsuarios());
		System.out.println("--------------------------------------------------------");	
	}
}
