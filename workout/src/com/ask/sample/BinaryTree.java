/**
 * 
 */
package com.ask.sample;

import java.util.Stack;

/**
 * @author sahar8
 *
 */
public class BinaryTree {
	static NodeObject rootNode = null;
	static Stack<Integer> searchNode = new Stack<Integer>();

	public static void main(String[] args) {

		int[] values = {5,6,3,1,2,4};
		int node1 = 2;
		int node2 = 4;
		System.out.println(bstDistance(values, values.length, node1, node2));
		
	}
	
	public static int bstDistance(int[] values, int n, int node1, int node2)
	{
		int node1Pos = 0;
		int node2Pos = 0;

		if (values.length > 0) {
			rootNode = new NodeObject(values[0]);
		}

		for (int i = 1; i < values.length; i++) {
			instertToTree(values[i]);
		}

		prepareStack(rootNode);

		for (int i = 0; i < searchNode.size(); i++) {
			int number = searchNode.get(i);
			if (number == node1) {
				node1Pos = i;
			}
			if (number == node2) {
				node2Pos = i;
			}
			if (node1Pos != 0 && node2Pos != 0) {
				break;
			}
		}
		if (node1Pos == 0 || node2Pos == 0) {
			return -1;
		}
		return Math.abs(node2Pos - node1Pos) + 1;
	}
	
	private static void prepareStack(NodeObject node) {
		if (node != null) {
			searchNode.push(node.getData());
			if (node.getRigthNode() != null) {
				prepareStack(node.getRigthNode());
			}
			if (node.getLeftNode() != null) {
				prepareStack(node.getLeftNode());
			}
		}

	}

	private static void instertToTree(int i) {
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

class NodeObject {
	NodeObject leftNode;
	NodeObject rigthNode;
	int data;

	public NodeObject(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	/**
	 * @return the leftNode
	 */
	public NodeObject getLeftNode() {
		return leftNode;
	}

	/**
	 * @param leftNode
	 *            the leftNode to set
	 */
	public void setLeftNode(NodeObject leftNode) {
		this.leftNode = leftNode;
	}

	/**
	 * @return the rigthNode
	 */
	public NodeObject getRigthNode() {
		return rigthNode;
	}

	/**
	 * @param rigthNode
	 *            the rigthNode to set
	 */
	public void setRigthNode(NodeObject rigthNode) {
		this.rigthNode = rigthNode;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

}