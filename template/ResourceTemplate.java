package com.optum.cs.training.patterns.template;

public interface ResourceTemplate {
	boolean open();
	void access();
	boolean close();
	
	default void use() {
		open();
		access();
		close();
	}
}
