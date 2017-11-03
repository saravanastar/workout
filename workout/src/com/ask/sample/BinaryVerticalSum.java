/**
 * 
 */
package com.ask.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sxa8465
 *
 */
public class BinaryVerticalSum {
	
	static NodeObject rootNode = null;
	static Map<Integer,Integer> verticalSumMap = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryVerticalSum verticalSum = new BinaryVerticalSum();
		int[] values = { 5, 6, 3, 1, 2, 4,7 };
		if (values.length > 0) {
			rootNode = new NodeObject(values[0]);
		}
		for (int i = 1; i < values.length; i++) {
			verticalSum.instertToTree(values[i]);
		}
		verticalSumMap = new HashMap<>();
		verticalSum.calculateVerticalSum(rootNode, 0);
		
		System.out.println(verticalSumMap);

	}
	
	
	private void calculateVerticalSum(NodeObject node, int verticalValue) {
		// TODO Auto-generated method stub
		if (node != null) {
			int nodeValue = node.getData();
			Integer existingValue = verticalSumMap.get(verticalValue);
			if (existingValue != null) {
				verticalSumMap.put(verticalValue, nodeValue+existingValue);
			} else {
				verticalSumMap.put(verticalValue, nodeValue);
			}
			calculateVerticalSum(node.getLeftNode(), verticalValue-1);
			calculateVerticalSum(node.getRigthNode(), verticalValue+1);
		}
	}




	/**
	 * 
	 * @param i
	 */
	private void instertToTree(int i) {
		NodeObject currentNode = rootNode;
		NodeObject parentNode = null;
		while (currentNode != null) {
			if (i < currentNode.getData()) {
				parentNode = currentNode;
				currentNode = currentNode.getLeftNode();
			} else {
				parentNode = currentNode;
				currentNode = currentNode.getRigthNode();
			}
		}
		if (i < parentNode.getData()) {
			NodeObject leftNode = new NodeObject(i);
			parentNode.setLeftNode(leftNode);
		} else {
			NodeObject rightNode = new NodeObject(i);
			parentNode.setRigthNode(rightNode);
		}
	}

}
