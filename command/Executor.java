package com.optum.cs.training.patterns.command;

import java.util.List;

public class Executor {
	public void execute(List<Command> tasks) {
		for (Command task : tasks) {
			task.run();
		}
	}
}
