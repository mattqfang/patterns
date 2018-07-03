package com.optum.cs.training.patterns.adapter;

import com.optum.cs.training.patterns.model.Document;
import com.optum.cs.training.patterns.model.WebPage;

public class WebPageClassAdapter extends WebPage implements Document {
	public WebPageClassAdapter(String url) {
		super(url);
	}
	
	@Override
	public void open() {
		System.out.println("Don't need to open...");
	}

	@Override
	public void view() {
		super.display();
	}

	@Override
	public void close() {
		System.out.println("Cannot close web page...");
	}

	@Override
	public void delete() {
		System.out.println("Cannot delete web page...");
	}

	@Override
	public void update() {
		System.out.println("Cannot update web page...");
	}
}
