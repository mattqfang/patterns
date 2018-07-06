package com.optum.cs.common.function;

@FunctionalInterface
public interface ThrowableBiConsumer<T, U> extends Throwable {
	default void accept(T t, U u) {
		try {
			acceptWithException(t, u);
		} catch (Exception e) {
			getLogger(this.getClass()).error("Exception: ", e);
		}
	}
	
	void acceptWithException(T t, U u) throws Exception;
}
