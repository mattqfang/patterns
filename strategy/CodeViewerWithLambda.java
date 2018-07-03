package com.optum.cs.training.patterns.strategy;

import java.util.function.Function;
import java.util.function.Predicate;

import com.optum.cs.training.patterns.builder.CodeBuilderUsingLambda;
import com.optum.cs.training.patterns.model.CPT;
import com.optum.cs.training.patterns.model.Code;

public class CodeViewerWithLambda {
	public static void publish(Code code, Predicate<Code> filter, Function<Code, String> func) {
		if (filter.test(code)) {
			System.out.println(func.apply(code)); 
		}
	}
	
	public static void main(String[] args) {
		CodeBuilderUsingLambda builder = new CodeBuilderUsingLambda();
		Code cpt = builder.with(b -> {
			b.code("99212");
			b.description("this is a cpt code.");
		}).getCode("CPT");
		
		Code mod = builder.with(b -> {
			b.code("51");
			b.description("this is a modifier.");
		}).getCode("MOD");
		CodeFormatter formatter = new CPTFormatter();
		publish(cpt, 
				formatter::filter, 
				formatter::format);
		publish(mod, 
				formatter::filter, 
				formatter::format);

	}

}
