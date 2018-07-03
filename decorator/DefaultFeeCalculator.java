package com.optum.cs.training.patterns.decorator;

public class DefaultFeeCalculator implements FeeCalculator {
	@Override
	public double calculate(double charge) {
		return charge;
	}
}
