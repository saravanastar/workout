/**
 * 
 */
package com.ask.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sahar8
 *
 */
public class SpeedCamers {

	Node rootNode = null;
	List<Node> irrelationalNodes = new ArrayList<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void insertNode(int a, int b) {
		searchNode(a);
	}

	public Node searchIrrelationalNode(int a) {
		for (Node node : irrelationalNodes) {
			Node currentNode = node;
			while (currentNode != null) {
				if (currentNode.getData() == a) {
					return currentNode;
				} else {
					currentNode = currentNode.getFrontNode();
				}
			}
		}
		return rootNode;

	}

	public Node searchNode(int dataValue) {
		Node currentNode = rootNode;
		Node resultNode = null;
		if (currentNode != null) {
			while (currentNode != null) {
				if (currentNode.getFrontNode() != null) {
					if (currentNode.getFrontNode().getData() == dataValue) {
						resultNode = currentNode.getFrontNode();
						break;
					} else {
						currentNode = currentNode.getFrontNode();
					}
				}
			}
		}
		return resultNode;
	}

	class Node {
		private int data;
		Node frontNode;
		Node backNode;

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

		/**
		 * @return the frontNode
		 */
		public Node getFrontNode() {
			return frontNode;
		}

		/**
		 * @param frontNode
		 *            the frontNode to set
		 */
		public void setFrontNode(Node frontNode) {
			this.frontNode = frontNode;
		}

		/**
		 * @return the backNode
		 */
		public Node getBackNode() {
			return backNode;
		}

		/**
		 * @param backNode
		 *            the backNode to set
		 */
		public void setBackNode(Node backNode) {
			this.backNode = backNode;
		}

	}
}
