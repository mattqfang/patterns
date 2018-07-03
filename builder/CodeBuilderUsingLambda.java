package com.optum.cs.training.patterns.builder;

import java.util.function.Consumer;

import com.optum.cs.training.patterns.factory.CodeFactoryUsingLambda;
import com.optum.cs.training.patterns.model.CPT;
import com.optum.cs.training.patterns.model.Code;
import com.optum.cs.training.patterns.model.Modifier;

public class CodeBuilderUsingLambda {
	private String code;
	private String description;
	
	public CodeBuilderUsingLambda with(Consumer<CodeBuilderUsingLambda> builderFunction) {
		builderFunction.accept(this);
		return this;
	}
	
	public void code(String code) {
		this.code = code;
	}
	
	public void description(String description) {
		this.description = description;
	}
	
	public Code getCPT() {
		Code cpt = new CPT();
		cpt.setCode(code);
		cpt.setDescription(description);
		return cpt;
	}
	
	public Code getModfier() {
		Code mod = new Modifier();
		mod.setCode(code);
		mod.setDescription(description);
		return mod;
	}
	
	public Code getCode(String codeType) {
		Code newCode = CodeFactoryUsingLambda.getCode(codeType);
		newCode.setCode(code);
		newCode.setDescription(description);
		return newCode;
	}
}
