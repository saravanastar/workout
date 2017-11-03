package com.ask.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

		char[] chars = new char[] { '\u0097' };
		String str = new String(chars);
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
		@SuppressWarnings("unused")
		SingletonClass singletonClass = SingletonClass.getInstance();
		singletonClass = SingletonClass.getInstance();
		singletonClass = SingletonClass.getInstance();
		singletonClass = SingletonClass.getInstance();
		
		
		ArrayList<Object> test= new ArrayList<Object>();
		test.add(5.00);
		for(Object object : test) {
			System.out.println(Double.valueOf(object.toString()));
		}

	}
}
