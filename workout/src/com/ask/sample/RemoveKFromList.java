package com.ask.sample;


public class RemoveKFromList {

	public static void main(String[] args) {
		// 3, 1, 2, 3, 4, 5
		ListNode<Integer> l = new ListNode<Integer>(3);
		ListNode<Integer> head = l;

		l.next = new ListNode<Integer>(1);
		l = l.next;
		l.next = new ListNode<Integer>(2);
		l = l.next;

		l.next = new ListNode<Integer>(3);
		l = l.next;

		l.next = new ListNode<Integer>(4);
		l = l.next;

		l.next = new ListNode<Integer>(5);
		l = l.next;

		l.next = new ListNode<Integer>(6);
		l = l.next;

		l.next = new ListNode<Integer>(1000);
		l = l.next;

		ListNode<Integer> result = new RemoveKFromList().removeKFromList(head, 3);

		while (result != null) {
			System.out.println(result.value);
			result = result.next;
		}

	}
	
	

	ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
		ListNode<Integer> rootReference = l;
		if (l != null)
			while (l != null) {
				if (l.value == k) {
					l = l.next;
					rootReference = l;
				} else if (l.next != null && l.next.value == k) {
					l.next = l.next.next;
					l = l.next;
				} else {
					l = l.next;
				}
				

			}
		return rootReference;
	}

}

class ListNode<T> {
	ListNode(T x) {
		value = x;
	}

	public ListNode() {
		// TODO Auto-generated constructor stub
	}

	T value;
	ListNode<T> next;
}