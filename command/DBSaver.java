package com.optum.cs.training.patterns.command;

public class DBSaver implements Command {
private final String message;
	
	public DBSaver(String message) {
		this.message = message;
	}
	@Override
	public void run() {
		System.out.println("save to database..." + message);

	}

}
