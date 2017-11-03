package com.ask.sample;

import java.util.Stack;

public class BinaryTreeDepthFirstSearch {
	
	public static void main(String[] args) {
		BinaryTreeDepthFirstSearch binaryTreeDepthFirstSearch = new BinaryTreeDepthFirstSearch();
		int[] values = { 5, 6, 3, 1, 2, 4, 7 };
		BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new BinaryTreePostOrderTraversal();
		NodeObject rootNode = binaryTreePostOrderTraversal.buildBST(values);
		binaryTreeDepthFirstSearch.depthFirstSearch(rootNode);
	}

	private void depthFirstSearch(NodeObject rootNode) {
		Stack<NodeObject> stack = new Stack<NodeObject>();
		stack.add(rootNode);
		while (!stack.isEmpty()) {
			NodeObject tempObject = stack.pop();
			if (tempObject.getRigthNode() != null) stack.push(tempObject.getRigthNode());
			if (tempObject.getLeftNode() != null) stack.push(tempObject.getLeftNode());
			System.out.println(tempObject.getData());
			
		}
		
	}

}
