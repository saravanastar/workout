/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class DefenderMethod implements defenderInterface1 {

	public static void main(String[] args) {
		new DefenderMethod().test();
	}

}

interface defenderInterface1 extends defenderInterface2 {
	default void test() {
		System.out.println("test");
	}
}

interface defenderInterface2 {
	default void test() {
		System.out.println("test2");
	}
}