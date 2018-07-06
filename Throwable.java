package com.optum.cs.common.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Throwable {
	//get logger to log exception
	default Logger getLogger(Class<?> clazz) {
		return LoggerFactory.getLogger(clazz);
	}
}
