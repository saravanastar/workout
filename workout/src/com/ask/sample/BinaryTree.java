/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class BinaryTree {
	static NodeObject rootNode = null;

	public static void main(String[] args) {

		int[] array = { 4, 5, 1, 2, 3 };

		if (array.length > 0) {
			rootNode = new NodeObject(array[0]);
		}

		for (int i = 1; i < array.length; i++) {
			insterTree(array[i]);
		}
	}

	private static void insterTree(int i) {
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