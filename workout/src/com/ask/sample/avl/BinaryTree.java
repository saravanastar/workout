package com.ask.sample.avl;

import java.util.Arrays;
import java.util.Stack;

public class BinaryTree {

    Node rootNode;
    public static void main(String[] args) {
        int[] inpitArray = {10,5,15,-10,-5,-1};
//        int[] inpitArray = {3,2,1,0,4};
        BinaryTree tree = new BinaryTree();

        Arrays.stream(inpitArray).forEach(tree::addNode);
        tree.iterateDFS();
        Node searchedNode = tree.searchNode(15);
        System.out.println(searchedNode == null ? "Node deosesn't exist" : "Found node " + searchedNode);
        int depth = tree.findDepth(searchedNode);
        System.out.println(depth);

        boolean balanced = tree.isBalancedTree(tree.rootNode,0);
        System.out.println("Balanced tree  "+balanced);

        tree.fixBalance();
        System.out.println("fixed the balance");
        balanced = tree.isBalancedTree(tree.rootNode,0);
        System.out.println("Balanced tree  "+balanced);
        tree.iterateDFS();

    }

    private boolean fixBalance() {
        if (rootNode != null) {
            return doBalance(rootNode);
        }
        return false;
    }

    private boolean doBalance(Node node) {
        if(node == null) {
            return true;
        }
        Stack<Node> stackIt = new Stack<>();
        stackIt.push(node);
        Node prevNode = null;
        while(!stackIt.isEmpty()) {
            Node tmp = stackIt.pop();
            int depthLeft = findInDepth(tmp.left, 0);
            int depthRight = findInDepth(tmp.right, 0);

            if (Math.abs(depthLeft-depthRight) > 1) {
                Node rotatedNode = null;
                if (depthLeft > depthRight) {
                    rotatedNode = rotateRight(tmp);

                } else {
                    rotatedNode = rotateLeft(tmp);
                }

                if (prevNode!= null && tmp.data == prevNode.left.data ) {
                    prevNode.left = rotatedNode;
                }
                if (prevNode!= null && tmp.data == prevNode.right.data ) {
                    prevNode.right = rotatedNode;
                }
                tmp = rotatedNode;
                if (prevNode == null) {
                    rootNode = rotatedNode;
                }
            }
            prevNode = tmp;
            if (tmp.right != null) {
                stackIt.push(tmp.right);
            }
            if (tmp.left != null) {
                stackIt.push(tmp.left);
            }


        }


        return true;
    }

    private Node rotateLeft(Node node) {
        Node tmpNode = node.right;
        Node tmpRight = tmpNode.left;

        tmpNode.left = node;
        node.right = null;
        if (tmpRight != null) {
            tmpNode.right = tmpRight;
        }

        return tmpNode;
    }

    private Node rotateRight(Node node) {
        Node tmpNode = node.left;
        Node tmpRight = tmpNode.right;

        tmpNode.right = node;
        node.left = null;
        if (tmpRight != null) {
            tmpNode.left = tmpRight;
        }

        return tmpNode;
    }

    private boolean isBalancedTree(Node node, int depth) {
        if (node != null) {
            int leftDepth = findInDepth(node.left, 0);
            int rightDepth = findInDepth(node.right,0);
            if ((Math.abs(leftDepth-rightDepth) > 1)) {
                return false;
            }
            return isBalancedTree(node.left, 0) && isBalancedTree(node.right, 0);

        } else {
            return true;
        }
    }

    private int findDepth(Node searchedNode) {
        if (rootNode != null && searchedNode != null) {
            return goDepth(rootNode, searchedNode.data, 0);
        }
        return 0;
    }

    private int findInDepth(Node node, int depth) {
        if (node == null) {
            return depth;
        }
        return Math.max(findInDepth(node.left, depth+1), findInDepth(node.right, depth+1));
    }
    private int goDepth(Node currentNode, int searchValue, int depth) {
        int left = 0;
        int right = 0;
        if (currentNode == null) {
            return 0;
        }
        if (currentNode.data == searchValue) {
            return depth;
        }
        if (searchValue < currentNode.data ) {
            left = goDepth(currentNode.left, searchValue, depth+1);
        } else {
            right = goDepth(currentNode.right, searchValue, depth+1);
        }
        return Math.max(left,right);
    }

    public Node searchNode(int data) {

        if (rootNode != null) {
            Node currentNode = rootNode;
            while(currentNode != null) {
                if (data == currentNode.data) {
                    return currentNode;
                }
                if (data < currentNode.data) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
        return null;

    }

    public void iterateDFS() {
        if (rootNode != null) {
            Stack<Node> treeStack = new Stack<>();
            treeStack.push(rootNode);
            while(!treeStack.isEmpty()) {
                Node tmpNode = treeStack.pop();
                System.out.println(tmpNode.data);
                if (tmpNode.right != null) {
                    treeStack.push(tmpNode.right);
                }
                if (tmpNode.left != null) {
                    treeStack.push(tmpNode.left);
                }
            }
        }
    }
    public boolean addNode(int data) {
        if (rootNode != null) {
            Node currentNode = rootNode;
           while (currentNode != null)
            if (data < currentNode.data) {
                if (currentNode.left == null) {
                    currentNode.setLeft(new Node(data));
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.setRight(new Node(data));
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        } else {
            rootNode = new Node(data);
        }
        return Boolean.TRUE;
    }

}


class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "left=" + left +
//                ", right=" + right +
//                ", data=" + data +
//                '}';
//    }
}
