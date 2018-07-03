package com.optum.cs.training.patterns.model;

public interface Document {
	void open();
	void view();
	void close();
	void delete();
	void update();
}
