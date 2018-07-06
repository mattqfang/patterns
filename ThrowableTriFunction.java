package com.optum.cs.common.function;

import java.util.Objects;
import java.util.Optional;

@FunctionalInterface
public interface ThrowableTriFunction<T, U, V, R> extends Throwable {
	default Optional<R> apply(T t, U u, V v) {
		try {
			return Optional.ofNullable(applyWithException(t, u, v));
		} catch (Exception e) {
			getLogger(this.getClass()).error("Exception: ", e);
			return Optional.empty();
		}
	}
	
	default <W> ThrowableTriFunction<T, U, V, W> andThen(ThrowableFunction<? super R, ? extends W> after) {
        Objects.requireNonNull(after);
        return (T t, U u, V v) -> after.applyWithException(applyWithException(t, u, v));
    }
	
	R applyWithException(T t, U u, V v) throws Exception;
}
