package com.optum.cs.training.patterns.builder;

import com.optum.cs.training.patterns.model.CPT;
import com.optum.cs.training.patterns.model.Code;
import com.optum.cs.training.patterns.model.Modifier;

public class CodeBuilder {
	private String code;
	private String description;
	//... a lot more attributes
	
	public CodeBuilder code(String code) {
		this.code = code;
		return this;
	}
	
	public CodeBuilder description(String description) {
		this.description = description;
		return this;
	}
	
	public Code getCPT() {
		Code cpt = new CPT();
		cpt.setCode(code);
		cpt.setDescription(description);
		return cpt;
	}
	
	public Code getModifier() {
		Code mod = new Modifier();
		mod.setCode(code);
		mod.setDescription(description);
		return mod;
	}
	
}
