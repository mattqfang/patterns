package com.optum.cs.training.patterns.model;

public class WebPage {
	private String url;
	
	public WebPage(String url) {
		this.url = url;
	}
	
	public void display() {
		System.out.println("display web page [" + url + "]");
	}
}
