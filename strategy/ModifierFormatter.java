package com.optum.cs.training.patterns.strategy;

import com.optum.cs.training.patterns.model.Code;

public class ModifierFormatter implements CodeFormatter {
	@Override
	public boolean filter(Code code) {
		return code.getType().equalsIgnoreCase("MOD");
	}

	@Override
	public String format(Code code) {
		return "<MODIFIER>"+code.getCode().toUpperCase()+"</MODIFIER>";
	}
}
