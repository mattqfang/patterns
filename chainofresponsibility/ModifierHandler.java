package com.optum.cs.training.patterns.chainofresponsibility;

import com.optum.cs.training.patterns.model.Code;

public class ModifierHandler implements CodeHandler {
	private CodeHandler handler;
	private final static String name = "<Modifier Handler>";
	@Override
	public void setHandler(CodeHandler handler) {
		this.handler = handler;
	}

	@Override
	public void process(Code code) {
		if ("MOD".equalsIgnoreCase(code.getType())) {
			System.out.println("process Modifier ["+code.getCode()+"]");
		} else if (handler != null) {
			handler.process(code);
		} else {
			System.out.println("Not supperted by " + name);
		}
	}

	@Override
	public String getHandlerName() {
		return name;
	}

}
