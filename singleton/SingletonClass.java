package com.optum.cs.training.patterns.singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static SingletonClass instance;
	
	private SingletonClass() {

	}
	
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		
		return instance;
	}
 }
