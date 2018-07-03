package com.optum.cs.training.patterns.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandWithLambda {
	private static void initialize(String message) {
		System.out.println(message);
	}
	
	private static void save(String message) {
		System.out.println(message);
	}
	
	private static void send(String message) {
		System.out.println(message);
	}
//	
//	private static void execute(List<Runnable> tasks) {
//		tasks.forEach(Runnable::run);
//	}
	
	public static void main(String[] args) {
		Arrays.<Runnable>asList(()->initialize("hi"),
				()->save("saving..."),
				()->send("bye"))
			.forEach(Runnable::run);
		
		
		
//		execute(tasks);
	}

}
