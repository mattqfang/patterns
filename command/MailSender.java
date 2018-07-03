package com.optum.cs.training.patterns.command;

public class MailSender implements Command {
	private final String message;
	
	public MailSender(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		System.out.println("sending an email..." + message);

	}

}
