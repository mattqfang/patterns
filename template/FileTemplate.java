package com.optum.cs.training.patterns.template;

import com.optum.cs.training.patterns.model.DatabaseResource;
import com.optum.cs.training.patterns.model.FileResource;

public class FileTemplate implements ResourceTemplate {
	private FileResource resource;
	@Override
	public boolean open() {
		this.resource = new FileResource();
		System.out.println("opening file...");
		return true;
	}

	@Override
	public void access() {
		System.out.println("using file ...");

	}

	@Override
	public boolean close() {
		System.out.println("closing file...");
		return true;
	}

}
