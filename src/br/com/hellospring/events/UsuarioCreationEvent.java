package br.com.hellospring.events;

import org.springframework.context.ApplicationEvent;

public class UsuarioCreationEvent extends ApplicationEvent {

	private static final long serialVersionUID = 2872062383563503997L;

	public UsuarioCreationEvent(Object source) {
		super(source);
	}

}
