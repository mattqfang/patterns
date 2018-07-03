package com.optum.cs.training.patterns.chainofresponsibility;

import com.optum.cs.training.patterns.model.CPT;
import com.optum.cs.training.patterns.model.Code;

public class CodeHandlerClient {

	public static void main(String[] args) {
		CodeHandler cptHandler = new CPTHandler();
		CodeHandler modHandler = new ModifierHandler();
		CodeHandler hcpcsHandler = new HcpcsHandler();
		
		modHandler.setHandler(cptHandler);
		cptHandler.setHandler(hcpcsHandler);
		
		Code cpt = new CPT("99212", "this is a cpt code.");
		
		modHandler.process(cpt);
		
	}

}
