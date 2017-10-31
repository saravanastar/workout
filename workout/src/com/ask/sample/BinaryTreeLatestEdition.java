/**
 * 
 */
package com.ask.sample;

import java.util.Stack;

/**
 * @author sahar8
 *
 */
public class BinaryTreeLatestEdition {
	static NodeObject rootNode = null;
	static Stack<Integer> searchNode = new Stack<Integer>();

	public static void main(String[] args) {

		int[] values = { 5, 6, 3, 1, 2, 4,7 };
		int node1 = 1;
		int node2 = 7;
		System.out.println(new BinaryTreeLatestEdition().bstDistance(values, values.length, node1, node2));

	}

	public int bstDistance(int[] values, int n, int node1, int node2) {

		if (values.length > 0) {
			rootNode = new NodeObject(values[0]);
		}

		for (int i = 1; i < values.length; i++) {
			instertToTree(values[i]);
		}

		NodeObject node = getCommonRootNode(node1, node2, rootNode);
		int distanceNode1 = findDistance(node, node1);
		int distanceNode2 = findDistance(node, node2);
		return distanceNode1 + distanceNode2;

	}

	/**
	 * 
	 * @param rootNode
	 * @param nodeValue
	 * @return
	 */
	private int findDistance(NodeObject rootNode, int nodeValue) {
		// TODO Auto-generated method stub
		NodeObject currentNode = rootNode;
		int distance = 0;
		while (currentNode.getData() != nodeValue) {
			if (nodeValue > currentNode.getData()) {
				currentNode = currentNode.getRigthNode();
				distance++;
			} else {
				currentNode = currentNode.getLeftNode();
				distance++;
			}
		}
		return distance;
	}

	/**
	 * 
	 * @param node1
	 * @param node2
	 * @param rootNode
	 * @return
	 */
	private NodeObject getCommonRootNode(int node1, int node2, NodeObject rootNode) {
		NodeObject currentNode = rootNode;
		boolean flag = false;
		while (!flag) {
			if (currentNode.getData() < node2 && currentNode.getData() < node1) {
				currentNode = currentNode.getRigthNode();
			} else if (currentNode.getData() > node2 && currentNode.getData() > node1) {
				currentNode = currentNode.getLeftNode();
			} else if ((currentNode.getData() > node2 && currentNode.getData() < node1)
					|| (currentNode.getData() < node2 && currentNode.getData() > node1)) {
				flag = true;
			}
		}
		return currentNode;
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
