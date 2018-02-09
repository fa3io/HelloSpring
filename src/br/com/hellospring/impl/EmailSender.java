package br.com.hellospring.impl;

import br.com.hellospring.interfaces.Sender;

public class EmailSender implements Sender {

	private String name;
	private String emailAddress;
	
	public EmailSender() {}
	
	public EmailSender(String name, String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
	}

	@Override
	public String getDetails() {
		return this.name + " <"+emailAddress+">";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
