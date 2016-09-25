/**
 * 
 */
package com.ask.sample;

import java.util.Stack;

/**
 * @author sahar8
 *
 */
public class MachineLearning {

	public static final String DUP_STRING = "DUP";
	public static final String ADD_STRING = "+";
	public static final String SUBTRACT_STRING = "-";
	public static final String POP_STRING = "POP";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(new MachineLearning().solution("13 DUP 4 POP 5 DUP + DUP + -"));
		System.out.println(new MachineLearning().solution("3 DUP 5 - -"));

	}

	public int solution(String S) {
		String[] inputArray = S.split(" ");
		Stack<Integer> processingStack = new Stack<Integer>();
		for (int i = 0; i < inputArray.length; i++) {

			switch (inputArray[i]) {
			case DUP_STRING:
				if (processingStack.size() > 0) {
					processingStack.push(processingStack.peek());
				} else {
					return -1;
				}
				break;
			case ADD_STRING:
				if (processingStack.size() > 2) {
					int addition1 = processingStack.pop();
					int addition2 = processingStack.pop();
					processingStack.push(addition1 + addition2);
				} else {
					return -1;
				}
				break;
			case SUBTRACT_STRING:
				if (processingStack.size() > 2) {
					int subtraction1 = processingStack.pop();
					int subtraction2 = processingStack.pop();
					processingStack.push((subtraction1 - subtraction2));
				} else {
					return -1;
				}
				break;

			case POP_STRING:
				if (processingStack.size() > 0) {
					processingStack.pop();
				} else {
					return -1;
				}
				break;

			default:
				try {
					int number = Integer.parseInt(inputArray[i]);
					processingStack.push(number);
				} catch (NumberFormatException e) {
					return -1;
				}
				break;

			}

		}
		if (processingStack.isEmpty()) {
			return -1;
		}  
		return processingStack.peek();

	}

}
