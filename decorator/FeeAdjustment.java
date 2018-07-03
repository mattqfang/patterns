package com.optum.cs.training.patterns.decorator;

public class FeeAdjustment {
	public static double applyNonRuralFee(double charge) {
		double adjustment = 5.0; //get adjustment
		return charge - adjustment;
	}
	
	public static double applyFacilityAmount(double charge) {
		double adjustment = 10.0; //get adjustment
		return charge - adjustment;
	}
}
