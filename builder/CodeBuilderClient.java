package com.optum.cs.training.patterns.builder;

import com.optum.cs.training.patterns.model.Code;

public class CodeBuilderClient {

	public static void main(String[] args) {
//		Code cpt = new CodeBuilder()
//			.code("99212")
//			.description("this is a good CPT code.")
//			.getCPT();
		Code cpt2 = new CodeBuilderUsingLambda()
			.with(b->{
				b.code("99212");
				b.description("this is a good CPT code.");
		}).getCPT();
	}

}
