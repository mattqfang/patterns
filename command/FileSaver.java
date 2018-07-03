package com.optum.cs.training.patterns.command;

public class FileSaver implements Command {
	private final String message;
	
	public FileSaver(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		System.out.println("saving to a file..." + message);

	}

}
