package br.com.hellospring.impl;

import br.com.hellospring.interfaces.Message;
import br.com.hellospring.interfaces.Sender;

public class EmailMessage implements Message {

	private String contents;
	private Sender from;
	
	@Override
	public String getMessage() {
		return from.getDetails() + ": \n" + this.contents;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Sender getFrom() {
		return from;
	}

	public void setFrom(Sender from) {
		this.from = from;
	}
}
