package com.optum.cs.training.patterns.template;

import java.util.function.Consumer;

import com.optum.cs.training.patterns.model.DatabaseResource;
import com.optum.cs.training.patterns.model.Resource;

public class TemplateWithLambda {
	private Resource resource;
	
	public void use(Consumer<Resource> c) {
		open();
		c.accept(resource);
		close();
	}
	
	private void open() {
		this.resource = new DatabaseResource();
		System.out.println("open database...");
	}
	
	private void close() {
		System.out.println("close database...");
	}
	
	public static void main(String[] args) {
		TemplateWithLambda template = new TemplateWithLambda();
		template.use(r->{
			System.out.println("use database...");
		});
	}
}
