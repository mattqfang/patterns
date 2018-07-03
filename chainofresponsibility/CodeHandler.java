package com.optum.cs.training.patterns.chainofresponsibility;

import com.optum.cs.training.patterns.model.Code;

public interface CodeHandler {
	void setHandler(CodeHandler handler);
	void process(Code code);
	String getHandlerName();
}
