package com.optum.cs.common.function;

import java.util.Objects;
import java.util.Optional;

@FunctionalInterface
public interface ThrowableFunction<T, R> extends Throwable {
	default Optional<R> apply(T t) {
		try {
			return Optional.ofNullable(applyWithException(t));
		} catch (Exception e) {
			getLogger(this.getClass()).error("Exception: ", e);
			return Optional.empty();
		}
	}
	
	default <V> ThrowableFunction<T, V> andThen(ThrowableFunction<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.applyWithException(applyWithException(t));
    }
	
	R applyWithException(T t) throws Exception;
}
