package com.optum.cs.training.patterns.template;

import com.optum.cs.training.patterns.model.DatabaseResource;
import com.optum.cs.training.patterns.model.Resource;

public class DatabaseTemplate implements ResourceTemplate {
	private Resource resource;
	@Override
	public boolean open() {
		this.resource = new DatabaseResource();
		System.out.println("opening database...");
		return true;
	}

	@Override
	public void access() {
		System.out.println("using database ...");

	}

	@Override
	public boolean close() {
		System.out.println("release database resource...");
		return true;
	}

}
