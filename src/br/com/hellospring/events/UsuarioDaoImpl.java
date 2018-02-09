package br.com.hellospring.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import br.com.hellospring.interfaces.UsuarioDAO;

public class UsuarioDaoImpl implements UsuarioDAO, ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void createUsuario(String name, String email) {
		System.out.println("Criando novo usuario!");
		applicationContext.publishEvent(new UsuarioCreationEvent(email));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
