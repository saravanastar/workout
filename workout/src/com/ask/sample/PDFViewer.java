package com.ask.sample;

import java.util.Scanner;

public class PDFViewer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		int max = 0;
		for (int i = 0; i < word.length(); i++) {
			int character = word.charAt(i);
			int index = character % 97;
			if (index < 26) {
				if (h[index] > max) {
					max = h[index];
				}
			}
		}
		System.out.println(max * word.length());
		in.close();
	}
}
