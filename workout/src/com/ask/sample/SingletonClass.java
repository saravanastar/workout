/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class SingletonClass {
	private static SingletonClass singletonClass = null;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if (singletonClass == null) {
			System.out.println("null");
			synchronized (SingletonClass.class) {
				singletonClass = new SingletonClass();
			}
		}
		return singletonClass;
	}
}
