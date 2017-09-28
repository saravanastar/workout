package com.ask.sample;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MajorityNumber {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int totalElements = in.nextInt();
		Map<Integer, Long> mapVAlue = IntStream.range(0, totalElements-1).map(i -> in.nextInt()).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		Long maxNumber = mapVAlue.entrySet().stream().map(entry -> entry.getValue()).max(Comparator.naturalOrder()).get();
		
		System.out.println(mapVAlue.entrySet().stream().filter(entry -> entry.getValue() == maxNumber).map(entry -> entry.getKey()).findFirst().orElse(-1).intValue());
		
		in.close();
	}
}
