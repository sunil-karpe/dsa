package test;

public class BinarySearchTree {

	Node root = null;

	public BinarySearchTree() {
		this.root = null;
	}

	// Initializing the BST with one element while the creating the object of this
	// BST
	public BinarySearchTree(int value) {

		this.root = new Node(value);
	}

	// Adding the element to the BST
	public BinarySearchTree insert(int value) {

		Node nextNode = this.root;
		Node newNode=new Node(value);

		if (nextNode == null) {
			nextNode = new Node(value);
			return this;
		}else {
			while(nextNode!=null) {
				if(value>nextNode.value) {
					if(nextNode.right==null) {
						nextNode.right=newNode;
						return this;
					}
					nextNode=nextNode.right;
				}else if(value<nextNode.value){
					if(nextNode.left==null) {
						nextNode.left=newNode;
						return this;
					}
					nextNode=nextNode.left;
				}
			}
//			nextNode=new Node(value);
		}

		return this;
	}
	
	//Finding the element present in the BST or not
	public boolean lookup(int value) {
		
		Node currentNode=this.root;
		
		if(currentNode==null) {
			return false;
		}
		while(currentNode!=null) {
			
			if(value==currentNode.value) {
				return true;
			}else {
				if(value>currentNode.value) {
					currentNode=currentNode.right;
				}else {
					currentNode=currentNode.left;
				}
			}
		}
		
		return false;
	}

	// Iterating the BST element one by one
	public void iterate() {
		
		Node currentNode=this.root;
	
		while(currentNode!=null) {
			System.out.println(currentNode.value);
			currentNode=currentNode.right;
		}
	}

}

class Node {

	Node left;
	Node right;
	int value;

	Node() {
		this.left = null;
		this.right = null;
		this.value = 0;
	}

	Node(int value) {
		this.value = value;
	}
}
