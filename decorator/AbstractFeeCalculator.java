package com.optum.cs.training.patterns.decorator;

import java.util.Optional;

public abstract class AbstractFeeCalculator implements FeeCalculator {
	protected Optional<FeeCalculator> feeCalculator = Optional.empty();
	
	public AbstractFeeCalculator(FeeCalculator feeCalculator) {
		this.feeCalculator = Optional.ofNullable(feeCalculator);
	}
	
	public AbstractFeeCalculator() {
		
	}
	protected abstract double applyAdjustment(double charge);

	@Override
	public double calculate(double charge) {
		return applyAdjustment(
			feeCalculator.isPresent()?feeCalculator.get().calculate(charge):charge
		);
	}

}
