package com.optum.cs.training.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandClient {

	public static void main(String[] args) {
		List<Command> tasks = new ArrayList<>();
		tasks.add(new DBSaver("DB job"));
		tasks.add(new FileSaver("file task"));
		tasks.add(new MailSender("bye"));
		
		new Executor().execute(tasks);
	}

}
