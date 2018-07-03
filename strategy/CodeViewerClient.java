package com.optum.cs.training.patterns.strategy;

import com.optum.cs.training.patterns.builder.CodeBuilder;
import com.optum.cs.training.patterns.model.Code;

public class CodeViewerClient {

	public static void main(String[] args) {
		CodeBuilder builder = new CodeBuilder();
		Code cpt = builder
				.code("99212")
				.description("this is a cpt code.")
				.getCPT();
		Code mod = builder
				.code("52")
				.description("this is a modifier.")
				.getModifier();
		
		CodeViewer codeViewer = new CodeViewer(new CPTFormatter());
		codeViewer.publish(cpt);
		codeViewer.publish(mod);
	}

}
