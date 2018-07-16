package com.ask.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
 static NodeObject rootNode = null;
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 
 public static void main(String[] args) {

//		int[] values = {5,6,3,1,2,4};
//
//		int node1 = 5;
//		int node2 = 4;
//		System.out.println(new Solution().bstDistance(values, values.length, node1, node2));
	 System.out.println(decrypt("flgxswdliefy"));
//     System.out.println(decrypt("dnotq"));
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

	static String decrypt(String word) {
        // your code goes here
        String decryptedString = "";
        String[] ss = word.split("");
		Arrays.binarySearch(ss,"a");
		if (word.length() > 0) {
            int initValue = 0;
            int multiplyTimes = 0;
            int previousValue = 0;
			decryptedString+=String.valueOf((char)(((int)word.charAt(0)) -1) );
            for (int i = 1; i < word.length(); i++) {
				 previousValue = word.charAt(i-1);
				int currentValue = word.charAt(i);
               	double multiplyCount = (int)(Math.ceil(Math.abs(previousValue+currentValue)/26)) - 4;
                int result  = (int)Math.abs((multiplyCount * 26 + currentValue) - previousValue);
                while (result > 122) {
                    result = result-26;
                }
                while (result < 96) {
                    result = result+26;
                }

				decryptedString+=String.valueOf((char)result );

            }
        }
        return decryptedString;
	}

	static int deletionDistance(String str1, String str2) {
		// your code goes here
		if (str1.length()<=2 && str2.length()<=2) {
			return str1.length();
		}
		Set<String> stringSet = new HashSet<>();
		int equalCount =0;
		for(int i = 0,j = 0; i<(str1.length()>str2.length()?str1.length():str2.length());i++, j++) {
			if (i<str1.length()) {
				String tmp = String.valueOf(str1.charAt(i));

				if (stringSet.add(tmp) == false) {
					equalCount+=2;
				}
			}
			if (j<str2.length()) {
				String tmp = String.valueOf(str2.charAt(j));

				if (stringSet.add(tmp) == false) {
					equalCount+=2;
				}
			}

		}

		return Math.max(0,(str1.length()+str2.length()) - equalCount);
	}
// METHOD SIGNATURE ENDS
}


