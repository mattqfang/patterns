package com.optum.cs.training.patterns.decorator;

import java.util.function.Function;
import java.util.stream.Stream;

public class FeeCalculatorUsingLambda {
	public static Function<Double, Double> defaultFeeCalculator = x->x*2;
	
	public static double unitCharge(double unitCharge, Function<Double, Double>... calculators) {
		return Stream.of(calculators)
			.reduce(Function.identity(), Function::andThen)
			.apply(unitCharge);
	}
	
	public static void main(String[] args) {
		System.out.println(
			new VolumeCalculator()
			.volume(3.0)
			.calculate(
				unitCharge(25.0, defaultFeeCalculator, FeeAdjustment::applyFacilityAmount, FeeAdjustment::applyNonRuralFee)
			)
		);
	}
}
