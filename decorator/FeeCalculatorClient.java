package com.optum.cs.training.patterns.decorator;

public class FeeCalculatorClient {

	public static void main(String[] args) {
		System.out.println(
		    new VolumeCalculator(
		    new NonRuralFeeCalculator(
		    new FacilityAmountCalculator()))
		    .volume(3.0)
		    .calculate(25.0)
		);
	}

}
