/**
 * 
 */
package com.ask.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @author sahar8
 *
 */
public class PortfolioManager {

	/**
	 * @param args
	 */

	  Node rootNode = null;
	  Queue<Node> queueNode = new PriorityQueue<Node>();
	
	  Queue<Node> oddQueue = new PriorityQueue<>();
	  Queue<Node> evenQueue = new PriorityQueue<>();

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PortfolioManager().findMax(6, "3 4 1 1 3 # 1"));

	}

	/* Node searchNode(Node searchNode, int nodeValue) {
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
		
	}*/
	
	
	  int findMax(int n, String tree) {
		buildNodes(tree);
		return calculateMaxInvest();
	}
	 
	

	private   int calculateMaxInvest() {
		recuresive(rootNode, "odd");
		int oddValue = oddQueue.stream().mapToInt(Node::getData).sum();
		int evenValue = evenQueue.stream().mapToInt(Node::getData).sum();
		int max = 0;
		if(oddValue > evenValue) {
			max = oddValue;
		}
		
		if(oddValue < evenValue) {
			max = evenValue;
		}
		return max;
		
	}
	
	private  void recuresive(Node node,String type) {
		if (node != null) {
			if (type.equalsIgnoreCase("odd")) {
				oddQueue.add(node);
				if (node.getLeftNode() != null) {
					recuresive(node.getLeftNode(), "even");
				}
				if (node.getRightNode() != null) {
					recuresive(node.getRightNode(), "even");
				}
				
			} else {
				evenQueue.add(node);
				if (node.getLeftNode() != null) {
					recuresive(node.getLeftNode(), "odd");
				}
				if (node.getRightNode() != null) {
					recuresive(node.getRightNode(), "odd");
				}
			}
		}
	}

	private   void buildNodes(String tree) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(Arrays.stream(tree.split(" ")).collect(Collectors.toList()));
		if (rootNode ==null) {
			rootNode =(Node)new Node(Integer.parseInt(list.get(0)));
			queueNode.offer(rootNode);
		}
		
		int index = 1;
		for (int i = 0; i < list.size(); i++) {
			Node currentNode = queueNode.poll();
			if (currentNode != null) {
				String leftNodeVAlue = "#";
				String rightNodeVAlue = "#";
				if (i+index >= list.size()) {
					break;
				}
				if (i+index+1 >= list.size()) {
					rightNodeVAlue = "#";
				}
				leftNodeVAlue = list.get(i+index);
				rightNodeVAlue = list.get(i+index+1);
				Node leftNode = null;
				Node rightNode = null;
				if (!leftNodeVAlue.equalsIgnoreCase("#")) {
					leftNode = new Node(Integer.parseInt(leftNodeVAlue));
					currentNode.setLeftNode(leftNode);
					queueNode.add(leftNode);
				}
				if (!rightNodeVAlue.equalsIgnoreCase("#")) {
					rightNode = new Node(Integer.parseInt(rightNodeVAlue));
					currentNode.setRightNode(rightNode);
					queueNode.add(rightNode);
				}
				
				
			}
			index++;
		}
		
	}

	class Node implements Comparable<Node>{
		Node leftNode;
		Node rightNode;
		int data;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

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

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		

	}

}
