package com.optum.cs.training.patterns.model;

public class CDM implements Document {
	private int id;
	
	public CDM(int id) {
		this.id = id;
	}
	
	@Override
	public void open() {
		System.out.println("open CDM [" + id +"]");
	}

	@Override
	public void view() {
		System.out.println("view CDM [" + id +"]");
	}

	@Override
	public void close() {
		System.out.println("open CDM [" + id +"]");
	}

	@Override
	public void delete() {
		System.out.println("delete CDM [" + id +"]");
	}

	@Override
	public void update() {
		System.out.println("update CDM [" + id +"]");
	}

}
