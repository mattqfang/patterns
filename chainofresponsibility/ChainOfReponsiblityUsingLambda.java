package com.optum.cs.training.patterns.chainofresponsibility;

import java.util.function.Function;
import java.util.stream.Stream;

import com.optum.cs.training.patterns.model.CPT;
import com.optum.cs.training.patterns.model.Code;
import com.optum.cs.training.patterns.model.Modifier;

public class ChainOfReponsiblityUsingLambda {
	public boolean processCPT(Code code) {
		System.out.println("processing by CPT processor...");
		if ("CPT".equalsIgnoreCase(code.getType())) {
			System.out.println("Process CPT code: " + code.getCode());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean processModifier(Code code) {
		System.out.println("processing by Modifier processor...");
		if ("MOD".equalsIgnoreCase(code.getType())) {
			System.out.println("Process modifier: " + code.getCode());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean processHcpcs(Code code) {
		System.out.println("processing by HCPCS processor...");
		if ("HCPCS".equalsIgnoreCase(code.getType())) {
			System.out.println("Process HCPCS code: " + code.getCode());
			return true;
		} else {
			return false;
		}
	}
	
	private void process(Code code) {
		Stream.<Function<Code, Boolean>>of(
				this::processCPT,
				this::processModifier,
				this::processHcpcs
			).map(f->f.apply(code))
			 .filter(x -> x)
			 .findFirst();
	}
	
	public static void main(String[] args) {
		ChainOfReponsiblityUsingLambda client = new ChainOfReponsiblityUsingLambda();
		
//		client.process(new CPT("99210", "this is a CPT code."));
		client.process(new Modifier("51", "this is a modifier."));
	}

}
