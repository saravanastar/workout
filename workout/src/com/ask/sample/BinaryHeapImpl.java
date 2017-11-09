package com.ask.sample;

import java.util.Arrays;

public class BinaryHeapImpl {
	int currentLocation = 0;
	int[] heapArray;

	BinaryHeapImpl(int size) {
		heapArray = new int[size];
		Arrays.fill(heapArray, -1);
	}

	public void insert(int value) {
		heapArray[currentLocation++] = value;

		heapifyUp(currentLocation - 1);

	}

	public void deleteMin() {
		
		heapArray[0] = heapArray[--currentLocation];
		heapArray[currentLocation] = -1;

		heapifyDown(0);

	}

	public int fetchParent(int childIndex) {
		return childIndex / 2;
	}

	public int fetchLeft(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	public int fetchRight(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private void heapifyUp(int index) {

		int temp = heapArray[index];
		int parentIndex = fetchParent(index);
		while (index > 0 && heapArray[parentIndex] > temp) {
			heapArray[index] = heapArray[parentIndex];
			heapArray[parentIndex] = temp;
			index = parentIndex;
			parentIndex = fetchParent(index);
		}

	}

	private void heapifyDown(int parentIndex) {

		int smallestIndex = parentIndex;
		int leftIndex = fetchLeft(parentIndex);
		int rightIndex = fetchRight(parentIndex);

		if (currentLocation > rightIndex && heapArray[parentIndex] > heapArray[rightIndex]) {
			smallestIndex = rightIndex;
		}

		if (currentLocation > leftIndex && heapArray[parentIndex] > heapArray[leftIndex]) {
			smallestIndex = leftIndex;
		}

		if (smallestIndex != parentIndex) {
			exchangeData(smallestIndex, parentIndex);
			heapifyDown(smallestIndex);
		}
	}

	private void exchangeData(int sourceIndex, int destIndex) {
		int tmp = heapArray[sourceIndex];
		heapArray[sourceIndex] = heapArray[destIndex];
		heapArray[destIndex] = tmp;
	}
	
	private void printArray() {
		Arrays.stream(heapArray).forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		BinaryHeapImpl binaryHeapImpl = new BinaryHeapImpl(6);
		binaryHeapImpl.insert(6);
		binaryHeapImpl.insert(5);
		binaryHeapImpl.insert(9);
		binaryHeapImpl.insert(8);
		binaryHeapImpl.insert(1);
		binaryHeapImpl.insert(3);
		binaryHeapImpl.printArray();
		binaryHeapImpl.deleteMin();
		System.out.println("After delete");
		binaryHeapImpl.printArray();
	}
}
