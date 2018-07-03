package com.optum.cs.training.patterns.decorator;

public class FacilityAmountCalculator extends AbstractFeeCalculator {
	public FacilityAmountCalculator(FeeCalculator feeCalculator) {
		super(feeCalculator);
	}
	
	public FacilityAmountCalculator() {
		
	}
	@Override
	protected double applyAdjustment(double charge) {
		return FeeAdjustment.applyFacilityAmount(charge);
	}


}
