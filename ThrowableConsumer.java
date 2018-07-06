package com.optum.cs.common.function;

import java.util.Objects;

@FunctionalInterface
public interface ThrowableConsumer<T> extends Throwable {
	default void accept(T t) {
		try {
			acceptWithException(t);
		} catch (Exception e) {
			getLogger(this.getClass()).error("Exception: ", e);
		}
	}
	
	default ThrowableConsumer<T> andThen(ThrowableConsumer<? super T> after) {
		Objects.requireNonNull(after);
        return (T t) -> { acceptWithException(t); after.acceptWithException(t); };
	}
	
	void acceptWithException(T t) throws Exception;
}
