package br.com.hellospring.events;


import java.util.Date;

import org.springframework.context.ApplicationListener;

public class UsuarioCreationListener implements ApplicationListener<UsuarioCreationEvent> {

	@Override
	public void onApplicationEvent(UsuarioCreationEvent applicationEvent) {
	
			String emailUsuario = (String)applicationEvent.getSource();
			long timestamp = applicationEvent.getTimestamp();
			
			System.out.println("Evento de criação de usuario recebido! Enviando email de Boas Vindas para: " + 
					emailUsuario + " Usuario foi criado em " + new Date(timestamp));			
		
		
	}

}
