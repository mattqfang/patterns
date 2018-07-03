package com.optum.cs.training.patterns.model;

public class PDF implements Document {
	private int id;
	
	public PDF(int id) {
		this.id = id;
	}
	@Override
	public void open() {
		System.out.println("open PDF [" + id +"]");
	}

	@Override
	public void view() {
		System.out.println("view PDF [" + id +"]");
	}

	@Override
	public void close() {
		System.out.println("close PDF [" + id +"]");
	}

	@Override
	public void delete() {
		System.out.println("delete PDF [" + id +"]");
	}

	@Override
	public void update() {
		System.out.println("update PDF [" + id +"]");
	}

}
