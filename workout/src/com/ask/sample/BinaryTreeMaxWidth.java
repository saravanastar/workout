package com.ask.sample;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMaxWidth {
	
	public static void main(String[] args) {
		BinaryTreeMaxWidth maxWidth = new BinaryTreeMaxWidth();
		int[] values = { 5, 8, 3, 1, 2, 4, 6,9 };
		BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new BinaryTreePostOrderTraversal();
		NodeObject rootNode = binaryTreePostOrderTraversal.buildBST(values);
		maxWidth.maxWidthTree(rootNode);
	}

	void maxWidthTree(NodeObject rootNode) {
		int maxWidth = 0;
		Queue<NodeObject> queue = new LinkedList<NodeObject>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			
			int size = queue.size();
			maxWidth = Math.max(maxWidth, size);
			
			while(size > 0) {
				NodeObject tempObject = queue.poll();
				if (tempObject.getLeftNode() != null) queue.add(tempObject.getLeftNode());
				if (tempObject.getRigthNode() != null) queue.add(tempObject.getRigthNode());
				size--;
			}
		}
		System.out.println(maxWidth);
		
	}

}


