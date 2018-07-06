package com.optum.cs.common.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringUtil {
	private StringUtil() {
		//do nothing
	}
	
	public static List<String> getWords(String context, Predicate<String> predicate, Function<String, String> transformation) {
		if (context==null) {
			return new ArrayList<>();
		}
		
		return Arrays.asList(context.split("[^\\w]+")).stream()
				.filter(predicate)
				.map(transformation)
				.collect(Collectors.toList());
	}
	
	public static String getLongestWord(String context, Predicate<String> predicate, Function<String, String> transformation) {
		return getWords(context, predicate, transformation).stream()
			.reduce("", (x, y)-> y.length()>x.length()?y:x);
	}
}
