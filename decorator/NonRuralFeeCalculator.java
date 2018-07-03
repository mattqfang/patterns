package com.optum.cs.training.patterns.decorator;

public class NonRuralFeeCalculator extends AbstractFeeCalculator {
	public NonRuralFeeCalculator(FeeCalculator feeCalculator) {
		super(feeCalculator);
	}
	
	public NonRuralFeeCalculator() {
		
	}
	
	@Override
	protected double applyAdjustment(double charge) {
		return FeeAdjustment.applyNonRuralFee(charge);
	}

}
