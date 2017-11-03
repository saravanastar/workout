
package com.ask.sample;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBreadthFirstSearch {
	
	public static void main(String[] args) {
		BinaryTreeBreadthFirstSearch binaryTreeDepthFirstSearch = new BinaryTreeBreadthFirstSearch();
		int[] values = { 5, 6, 3, 1, 2, 4, 7 };
		BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new BinaryTreePostOrderTraversal();
		NodeObject rootNode = binaryTreePostOrderTraversal.buildBST(values);
		binaryTreeDepthFirstSearch.depthFirstSearch(rootNode);
	}

	private void depthFirstSearch(NodeObject rootNode) {
		Queue<NodeObject> queue = new LinkedList<NodeObject>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			NodeObject tempObject = queue.poll();
			if (tempObject.getLeftNode() != null) queue.add(tempObject.getLeftNode());
			if (tempObject.getRigthNode() != null) queue.add(tempObject.getRigthNode());
			
			System.out.println(tempObject.getData());
			
		}
		
	}

}

