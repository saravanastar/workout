package com.ask.sample;

import java.util.function.Function;

public class FunctionalInterfaceCallingProgram {

	public static void main(String[] args) {
		Function<String, Integer> stringToInt = x -> Integer.valueOf(x)+1;
		System.out.println(stringToInt.apply("4"));
	}
}
