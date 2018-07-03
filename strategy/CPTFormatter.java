package com.optum.cs.training.patterns.strategy;

import com.optum.cs.training.patterns.model.Code;

public class CPTFormatter implements CodeFormatter {

	@Override
	public boolean filter(Code code) {
		return code.getType().equalsIgnoreCase("CPT");
	}

	@Override
	public String format(Code code) {
		return "<CPT>"+code.getCode().toUpperCase()+"</CPT>";
	}

}
