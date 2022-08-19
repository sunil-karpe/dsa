//package test;
//
//public class LinkedList {
//
//	Node head = null;
//	Node tail = null;
//
//	//Add the element add particular position O(n)
//	public LinkedList add(int index,int value) {
//		
//		Node node=new Node(value);
//		Node currentNode=this.head;
//	
//		
//		if(index==0) {
//			this.prepend(value);	
//			return this;
//		}
//		
//		for(int i=0;i<index-1&&currentNode!=null;i++) {
//			currentNode=currentNode.next;
//		}
//
//		if(currentNode==null) {
//			this.append(value);
//			
//			return this;
//		}
//
//		node.next=currentNode.next;
//		currentNode.next=node;
//		
//	
//		return this;
//	}
//	
//	
//
//	//Insert the value O(n)
//	public LinkedList insert(int value) {
//
//		Node node = new Node(value);
//
//		if (this.head == null) {
//			this.head = node;
//			return this;
//		}
//
//		Node last = this.head;
//
//		while (last.next != null) {
//			last = last.next;
//		}
//
//		this.tail = node;
//
//		last.next = this.tail;
//
//		return this;
//	}
//
//	
//	//Add the element at very last position O(1)
//	public LinkedList append(int value) {
//
//		if (this.head == null) {
//			this.head = new Node(value);
//
//			return this;
//		}
//		Node node = new Node(value);
//
//		this.tail.next = node;
//		this.tail = node;
//
//		return this;
//	}
//	
//
//	// Method to add the element at very first position O(1)
//	public LinkedList prepend(int value) {
//
//		Node node = new Node(value);
//		Node current;
//
//		current = this.head;
//
//		this.head = node;
//		this.head.next = current;
//
//		return this;
//
//	}
//
//	// static method to display the data in the linked list O(n)
//	public static void PrintList(LinkedList list) {
//
//		Node currentNode = list.head;
//
//		while (currentNode != null) {
//			System.out.println(currentNode.data);
//			currentNode = currentNode.next;
//		}
//
//	}
//
//	// non static method to display the data in the linked list O(n)
//	public void display() {
//
//		Node currentNode = this.head;
//
//		while (currentNode != null) {
//			System.out.println(currentNode.data);
//			currentNode = currentNode.next;
//		}
//
//	}
//
//	// delete the data in the list O(n)
//
//	public LinkedList delete(int data) {
//
//		Node currentNode = this.head;
//		Node lastNode = currentNode;
//
//		if (this.head.data == data) {
//			this.head = this.head.next;
//			return this;
//		}
//
//		while (currentNode != null) {
//
//			if (currentNode.data == data) {
//				lastNode.next = currentNode.next;
//				return this;
//			}
//
//			lastNode = currentNode;
//			currentNode = currentNode.next;
//			if (currentNode == null) {
//
//				System.out.println("item not found to delete");
//			}
//
//		}
//
//		return this;
//	}
//	
//	public LinkedList remove(int index) {
//		
//		
//		
//		Node startNode=getStartNode(index-1);
//		
//		Node removeNode=startNode.next;
//		
//		Node nextNode=removeNode.next;
//		
//		startNode.next=nextNode;
//		
//		
//		return this;
//	}
//	
//	public Node getStartNode(int index) {
//		
//		int counter=0;
//		Node startNode=this.head;
//		while(counter!=index) {
//			startNode=startNode.next;
//			counter++;
//		}
//		
//		return startNode;
//	}
//
//}
//
////node structure for singly linkedlist
////class Node {
////
////	int data;
////
////	Node next;
////
////	Node(int value) {
////		this.data = value;
////		next = null;
////	}
////
////}
