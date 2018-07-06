package com.optum.cs.common.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.cs.common.function.ThrowableFunction;

public class JsonUtil {
	private JsonUtil() {
		//do nothing
	}
	
	public static final ThrowableFunction<Object, String> JSONIFY_FUNC = JsonUtil::jsonify;
	
	public static String jsonify(Object obj) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(obj);
	}
}
