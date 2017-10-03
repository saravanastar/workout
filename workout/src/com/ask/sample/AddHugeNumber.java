package com.ask.sample;

import java.math.BigInteger;

public class AddHugeNumber {
	
	public static void main(String[] args) {
		ListNode<Integer> l = new ListNode<Integer>(9876);
		ListNode<Integer> head = l;

		l.next = new ListNode<Integer>(5432);
		l = l.next;
		l.next = new ListNode<Integer>(1999);
		l = l.next;

		ListNode<Integer> b = new ListNode<Integer>(1);
		ListNode<Integer> headb = b;

		b.next = new ListNode<Integer>(8001);
		b = b.next;
//		b.next = new ListNode<Integer>(1999);
//		b = b.next;
		
		new AddHugeNumber().addTwoHugeNumbers(head, headb);

	}
	ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

		String temp = "";
		while (a != null) {
			temp += a.value;
			a = a.next;
		}
		BigInteger left = new BigInteger(temp);
		temp = "";

		while (b != null) {
			temp += b.value;
			b = b.next;
		}
		BigInteger right = new BigInteger(temp);

		BigInteger result = left.add(right);
		String[] resultString = result.toString().split("(?<=\\G.{4})");
		
		for (String input : resultString) {
			System.out.println(input.replaceFirst("^(?!)0$", ""));
		}
		System.out.println();
		return b;

	}
}

// class ListNode<T> {
// ListNode(T x) {
// value = x;
// }
//
// T value;
// ListNode<T> next;
// }
