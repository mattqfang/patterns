package com.optum.cs.training.patterns.decorator;

public class VolumeCalculator extends AbstractFeeCalculator {
	private double volume;
	
	public VolumeCalculator(FeeCalculator feeCalculator) {
		super(feeCalculator);
	}
	
	public VolumeCalculator() {
		
	}
	
	public VolumeCalculator volume(double volume) {
		this.volume = volume;
		return this;
	}
	
	@Override
	protected double applyAdjustment(double charge) {
		return charge*volume;
	}

}
