package com.optum.cs.common.function;

public interface ThrowableTriConsumer<T, U, V> extends Throwable {
	default void accept(T t, U u, V v) {
		try {
			acceptWithException(t, u, v);
		} catch (Exception e) {
			getLogger(this.getClass()).error("Exception: ", e);
		}
	}
	
	void acceptWithException(T t, U u, V v) throws Exception;
}
