package com.optum.cs.training.patterns.strategy;

import com.optum.cs.training.patterns.model.Code;

public class CodeViewer {
	private final CodeFormatter formatter;
	
	public CodeViewer(CodeFormatter formatter) {
		this.formatter = formatter;
	}
	
	public void publish(Code code) {
		if (formatter.filter(code)) {
			System.out.println(formatter.format(code)); 
		}
	}
}
