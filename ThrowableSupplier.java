package com.optum.cs.common.function;

import java.util.Optional;

@FunctionalInterface
public interface ThrowableSupplier<R> extends Throwable {
	default Optional<R> get() {
		try {
			return Optional.ofNullable(getWithException());
		}
		catch (Exception e) {
			getLogger(this.getClass()).error("Exception: ", e);
			return Optional.empty();
		}
	}
	
	R getWithException() throws Exception;
}
