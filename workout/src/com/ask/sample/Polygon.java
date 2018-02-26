package com.ask.sample;

public class Polygon {
	
	public static void main(String[] args) {
		polygon(36, 30, 36, 30);
	}
	
	static int polygon(int a, int b, int c, int d) {
		
		if (a==c && b==d) {
			return 1;
		} else if (a==b && b==c && c==d) {
			return 2;
		}
		return 0;

    }

}
