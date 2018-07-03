package com.optum.cs.training.patterns.adapter;

import com.optum.cs.training.patterns.model.Document;
import com.optum.cs.training.patterns.model.WebPage;

public class WebPageObjectAdapter implements Document {
	private WebPage webPage;
	
	public WebPageObjectAdapter(WebPage webPage) {
		this.webPage = webPage;
	}
	
	@Override
	public void open() {
		System.out.println("Don't need to open...");
	}

	@Override
	public void view() {
		webPage.display();
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
