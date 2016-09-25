/**
 * 
 */
package com.ask.sample;

/**
 * @author sahar8
 *
 */
public class TreeSample {
	public static NodeObject root;

	public TreeSample() {
		this.root = null;
	}

	public boolean find(int id) {
		NodeObject current = root;
		while (current != null) {
			if (current.data == id) {
				return true;
			} else if (current.data > id) {
				current = current.leftNode;
			} else {
				current = current.rigthNode;
			}
		}
		return false;
	}

	public boolean delete(int id) {
		NodeObject parent = root;
		NodeObject current = root;
		boolean isleftNodeChild = false;
		while (current.data != id) {
			parent = current;
			if (current.data > id) {
				isleftNodeChild = true;
				current = current.leftNode;
			} else {
				isleftNodeChild = false;
				current = current.rigthNode;
			}
			if (current == null) {
				return false;
			}
		}
		// if i am here that means we have found the node
		// Case 1: if node to be deleted has no children
		if (current.leftNode == null && current.rigthNode == null) {
			if (current == root) {
				root = null;
			}
			if (isleftNodeChild == true) {
				parent.leftNode = null;
			} else {
				parent.rigthNode = null;
			}
		}
		// Case 2 : if node to be deleted has only one child
		else if (current.rigthNode == null) {
			if (current == root) {
				root = current.leftNode;
			} else if (isleftNodeChild) {
				parent.leftNode = current.leftNode;
			} else {
				parent.rigthNode = current.leftNode;
			}
		} else if (current.leftNode == null) {
			if (current == root) {
				root = current.rigthNode;
			} else if (isleftNodeChild) {
				parent.leftNode = current.rigthNode;
			} else {
				parent.rigthNode = current.rigthNode;
			}
		} else if (current.leftNode != null && current.rigthNode != null) {
			// now we have found the minimum element in the rigthNode sub tree
			NodeObject successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isleftNodeChild) {
				parent.leftNode = successor;
			} else {
				parent.rigthNode = successor;
			}
			successor.leftNode = current.leftNode;
		}
		return true;
	}

	public NodeObject getSuccessor(NodeObject deleleNode) {
		NodeObject successsor = null;
		NodeObject successsorParent = null;
		NodeObject current = deleleNode.rigthNode;
		while (current != null) {
			successsorParent = successsor;
			successsor = current;
			current = current.leftNode;
		}
		// check if successor has the rigthNode child, it cannot have leftNode child for
		// sure
		// if it does have the rigthNode child, add it to the leftNode of
		// successorParent.
		// successsorParent
		if (successsor != deleleNode.rigthNode) {
			successsorParent.leftNode = successsor.rigthNode;
			successsor.rigthNode = deleleNode.rigthNode;
		}
		return successsor;
	}

	public void insert(int id) {
		NodeObject newNode = new NodeObject(id);
		if (root == null) {
			root = newNode;
			return;
		}
		NodeObject current = root;
		NodeObject parent = null;
		while (true) {
			parent = current;
			if (id < current.data) {
				current = current.leftNode;
				if (current == null) {
					parent.leftNode = newNode;
					return;
				}
			} else {
				current = current.rigthNode;
				if (current == null) {
					parent.rigthNode = newNode;
					return;
				}
			}
		}
	}

	public void display(NodeObject root) {
		if (root != null) {
			display(root.leftNode);
			System.out.print(" " + root.data);
			display(root.rigthNode);
		}
	}

	public static void main(String arg[]) {
		TreeSample b = new TreeSample();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		System.out.println("Delete Node with no children (2) : " + b.delete(2));
		b.display(root);
		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));
		b.display(root);
		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
		b.display(root);
	}
}

