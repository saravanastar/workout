package com.ask.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal {
	NodeObject rootNode = null;

	public static void main(String[] args) {
		int[] values = { 5, 6, 3, 1, 2, 4, 7 };
		BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new BinaryTreePostOrderTraversal();
		binaryTreePostOrderTraversal.rootNode = binaryTreePostOrderTraversal.buildBST(values);
		List<Integer> result = binaryTreePostOrderTraversal
				.postOrderTraversal(binaryTreePostOrderTraversal.rootNode);

		result.stream().forEach(System.out::println);
	}

	private List<Integer> postOrderTraversal(NodeObject rootNode) {
		Stack<NodeObject> traversedNodes = new Stack<>();

		if (rootNode == null) {
			return null;
		}
		traversedNodes.push(rootNode);
		List<Integer> result = new ArrayList<Integer>();
		while (!traversedNodes.isEmpty()) {
			NodeObject tempNode = traversedNodes.peek();
			if (tempNode.getLeftNode() == null && tempNode.getRigthNode() == null) {
				NodeObject pop = traversedNodes.pop();
				result.add(pop.getData());
			} else {
				if (tempNode.getRigthNode() != null) {
					traversedNodes.push(tempNode.getRigthNode());
					tempNode.setRigthNode(null);
				}

				if (tempNode.getLeftNode() != null) {
					traversedNodes.push(tempNode.getLeftNode());
					tempNode.setLeftNode(null);
				}
			}

		}
		return result;
	}

	public NodeObject buildBST(int[] values) {
		NodeObject rootNode = null;
		if (values.length > 0) {
			rootNode = new NodeObject(values[0]);
		}

		for (int i = 1; i < values.length; i++) {
			instertToTree(values[i], rootNode);
		}
		return rootNode;
	}

	private NodeObject instertToTree(int i, NodeObject rootNode) {
		if (rootNode == null) {
			return null;
		}
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
		return parentNode;
	}

}
