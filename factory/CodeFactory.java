package com.optum.cs.training.patterns.factory;

import com.optum.cs.training.patterns.model.CPT;
import com.optum.cs.training.patterns.model.Code;
import com.optum.cs.training.patterns.model.Modifier;

public class CodeFactory {
	public static Code getCPT() {
		return new CPT();
	}
	
	public static Code getCPT(String code, String description) {
		return new CPT(code, description);
	}
	
	public static Code getModifier() {
		return new Modifier();
	}
}
