package com.optum.cs.training.patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.optum.cs.training.patterns.model.CPT;
import com.optum.cs.training.patterns.model.Code;
import com.optum.cs.training.patterns.model.Modifier;

public class CodeFactoryUsingLambda {
	private static final Map<String, Supplier<Code>> suppliers = new HashMap<>();
	static {
		suppliers.put("CPT",CPT::new);
		suppliers.put("MOD",Modifier::new);		
	};
	
	public static Code getCode(String codeType) {
		if (suppliers.containsKey(codeType)) {
			return suppliers.get(codeType).get();
		}
		else {
			throw new RuntimeException("Incorrect code type: [" + codeType + "]");
		}
	}
}
