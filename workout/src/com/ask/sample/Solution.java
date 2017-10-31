package com.ask.sample;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
 static NodeObject rootNode = null;
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 
 public static void main(String[] args) {

		int[] values = {5,6,3,1,2,4};
		
		int node1 = 5;
		int node2 = 4;
		System.out.println(new Solution().bstDistance(values, values.length, node1, node2));
		
	}
 
public int bstDistance(int[] values, int n, 
                             int node1, int node2)
{
 if (values.length > 0) {
			rootNode = new NodeObject(values[0]);
		}

		for (int i = 1; i < values.length; i++) {
			instertToTree(values[i]);
		}

		NodeObject node = getCommonRootNode(node1, node2, rootNode);
		if (node != null) {
		int distanceNode1 = findDistance(node, node1);
		int distanceNode2 = findDistance(node, node2);
		if (distanceNode1 ==-1 || distanceNode2 == -1) {
			return -1;
		}
		return distanceNode1 + distanceNode2;
		}
		return -1;
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
			if (currentNode == null) {
				return -1;
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
			if (currentNode != null) {
				if (currentNode.getData() < node2 && currentNode.getData() < node1) {
					currentNode = currentNode.getRigthNode();
				} else if (currentNode.getData() > node2 && currentNode.getData() > node1) {
					currentNode = currentNode.getLeftNode();
				} else if ((currentNode.getData() > node2 && currentNode.getData() < node1)
						|| (currentNode.getData() < node2 && currentNode.getData() > node1) || (currentNode.getData() == node2 || currentNode.getData() == node1)) {
					flag = true;
				}
			} else {
				return null;
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
// METHOD SIGNATURE ENDS
}


