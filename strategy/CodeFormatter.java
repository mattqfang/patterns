package com.optum.cs.training.patterns.strategy;

import com.optum.cs.training.patterns.model.Code;

public interface CodeFormatter {
	boolean filter(Code code);
	String format(Code code);
}
