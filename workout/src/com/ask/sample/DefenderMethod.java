/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class DefenderMethod implements DefenderInterface1 {

	public static void main(String[] args) {
		new DefenderMethod().test();
	}

}

interface DefenderInterface1 extends DefenderInterface2 {
	default void test() {
		System.out.println("test");
	}
}

interface DefenderInterface2 {
	default void test() {
		System.out.println("test2");
	}
}