/**
 * 
 */
package com.ask.sample;

import java.util.Arrays;

/**
 * @author sahar8
 *
 */
public class PortfolioManager {

	/**
	 * @param args
	 */

	static Node rootNode = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMax(6, "3 4 5 1 3 # 1");

	}

	static Node searchNode(Node searchNode, int nodeValue) {
		Node resultNode = null;
		while (searchNode != null && resultNode==null) {
			if (searchNode.getData() ==nodeValue) {
				resultNode = searchNode;
				break;
			} else {
				if (resultNode ==null) {
					resultNode = searchNode(searchNode.leftNode,nodeValue);
				}
				if (resultNode ==null) {
					resultNode = searchNode(searchNode.rightNode,nodeValue);
					}
			}
		}
		return resultNode;
		
	}
	static int findMax(int n, String tree) {
		String[] inputNodes = tree.split(" ");
//		int[] inputNodes = Arrays.stream(tree.split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		PortfolioManager managerv = new PortfolioManager();
		Node currentNode = null;
		int count = 1;
		for (int i = 0; i < n; i++) {
			if(String.valueOf(inputNodes[i]).equals("#")) {
				continue;
			}
				if (rootNode == null) {
					
					rootNode = managerv.new Node();
					rootNode.setData(Integer.parseInt(inputNodes[i]));
					currentNode = rootNode;
				} else {
					currentNode = searchNode(rootNode,Integer.parseInt(inputNodes[i]));
				}
				if (currentNode != null) {
					if (i+count < n) {
						if(!String.valueOf(inputNodes[i+count]).equals("#")) {
							Node leftNode = managerv.new Node();
							leftNode.setData(Integer.parseInt(inputNodes[i+count]));
							currentNode.setLeftNode(leftNode);
						}
						count++;
						if(!String.valueOf(inputNodes[i+count]).equals("#")) {
							Node rightNode = managerv.new Node();
							rightNode.setData(Integer.parseInt(inputNodes[i+count]));
							currentNode.setRightNode(rightNode);
						}
//						count++;
					}
				}
		}

		return n;

	}

	class Node {
		Node leftNode;
		Node rightNode;
		int data;

		/**
		 * @return the leftNode
		 */
		public Node getLeftNode() {
			return leftNode;
		}

		/**
		 * @param leftNode
		 *            the leftNode to set
		 */
		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}

		/**
		 * @return the rightNode
		 */
		public Node getRightNode() {
			return rightNode;
		}

		/**
		 * @param rightNode
		 *            the rightNode to set
		 */
		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
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

}
