package com.optum.cs.common.function;

import java.util.Objects;
import java.util.Optional;

public interface ThrowableBiFunction<T, U, R> extends Throwable {
	default Optional<R> apply(T t, U u) {
		try {
			return Optional.ofNullable(applyWithException(t, u));
		} catch (Exception e) {
			getLogger(this.getClass()).error("Exception: ", e);
			return Optional.empty();
		}
	}
	
	default <V> ThrowableBiFunction<T, U, V> andThen(ThrowableFunction<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t, U u) -> after.applyWithException(applyWithException(t, u));
    }
	
	R applyWithException(T t, U u) throws Exception;
}


