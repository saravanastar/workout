package com.ask.sample;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SparseArray {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> sample = IntStream.range(0, input.nextInt()).mapToObj(i -> input.next()).collect(Collectors.toList());
		IntStream.range(0, input.nextInt()).mapToObj(i -> input.next()).mapToLong(q -> sample.stream().filter(q::equalsIgnoreCase).count()).forEach(System.out::println);
		input.close();
	}

}
