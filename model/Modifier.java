package com.optum.cs.training.patterns.model;

public class Modifier implements Code {
	private String code;
	private String description;
	
	public Modifier() {
		
	}
	
	public Modifier(String code, String description) {
		this.code = code;
		this.description = description;
	}
	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;

	}

	@Override
	public String getType() {
		return "MOD";
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

}
