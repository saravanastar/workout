package com.ask.sample;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		ReverseLinkedList linkedList = new ReverseLinkedList();
		int[] input = {5,4,3,2,1};
		NodeList headNode = linkedList.prepareList(input);
		linkedList.printList(headNode);
        System.out.println();
        headNode = linkedList.reverseList(headNode);

		linkedList.printList(headNode);
        System.out.println();
        headNode = linkedList.reverseListRecursion(headNode, headNode, null, headNode.next);

		linkedList.printList(headNode);
		
	}
    private NodeList reverseListRecursion(NodeList currentNode, NodeList headNode, NodeList prev, NodeList next) {
        if (currentNode != null) {

            currentNode.next = prev;


            if (next != null) {
                NodeList tmpNode = next.next;
                next.next = currentNode;
                prev = next;
                currentNode = tmpNode;
                headNode = reverseListRecursion(currentNode, currentNode, prev, currentNode.next);
            }
        }
        return headNode;
    }
	private NodeList reverseList(NodeList headNode) {
		// TODO Auto-generated method stub
		NodeList currentNode = headNode, prev = null, next = null;
		
		while (currentNode != null) {
			next = currentNode.next;
//			prev = currentNode;
			NodeList tmpNode = currentNode;
			tmpNode.next = prev;
			prev = next;
            if (next != null) {
                currentNode = next.next;
                next.next = tmpNode;
            } else {
                break;
            }
        }
        return currentNode;
	}

	private void printList(NodeList headNode) {
		// TODO Auto-generated method stub
		NodeList currentNode = headNode;
		
		while(currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		
	}

	private NodeList prepareList(int[] input) {
		// TODO Auto-generated method stub
		NodeList headerNode = null;
		NodeList currentNode = null;
		
		for (int i = 0; i < input.length; i++) {
			if(currentNode == null) {
				headerNode = new NodeList(input[i]);
				currentNode =headerNode;
			} else {
				NodeList temp = new NodeList(input[i]);
				currentNode.setNext(temp);
				currentNode = temp;
			}
		}
		
		return headerNode;
		
	}

}

class NodeList {
	
	NodeList next;
	int data;
	NodeList(int data) {
		this.data =data;
	}
	public NodeList getNext() {
		return next;
	}
	public void setNext(NodeList next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
