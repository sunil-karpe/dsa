package test;

public class DoublyLinkedList {
	
	Node head=null;
	Node tail=null;
	int length=0;
	
	//Method to add the item to very first position in list (create a new head)
	public DoublyLinkedList prepend(int data) {
		
		Node newNode=new Node(data);
		
		//when list is all empty
		if(this.head==null) {
			this.head=newNode;
			this.length++;
			return this;
		}
		
		//When list got at least one item already added
		newNode.next=this.head;
		this.head.prev=newNode;
		this.head=newNode;	
		this.length++;
		
		//Return the list with new item added at the beginning as a head
		return this;
	}
	
	//Method to get and print all the items present in the list as a array
	public int[] getAll() {
		
		int arr[]=new int[this.length];
		int index=0;
		Node currentNode=this.head;
		
		while(currentNode!=null) {
			arr[index]=(int)(currentNode.data);
			System.out.println(currentNode.data);
			index++;
			currentNode=currentNode.next;			
		}
		
		return arr;
		
	}
	
	//Method to add the element at the index position
	
	public DoublyLinkedList insert(int index,int data) {
		
		Node newNode=new Node(data);
		Node currentNode=this.head;
		
		
		if(index==0) {
			
			if(this.head==null) {
				this.head=newNode;
				return this;
			}
			
			newNode.next=this.head;
			this.head.prev=newNode;
			this.head=newNode;
			
			
			
			return this;
			
		}
		
		
		
		
		
		return this;
	}
	
	//Get the index node from the list
	private DoublyLinkedList getIndexNode(int index) {
		
		Node currentNode=this.head;
		
		for(int i=0;i<index&&currentNode!=null;i++) {
			
			
		}
		
		
		
		return this;
	}
	

	
		
	

}


class Node{
	
	int data;
	Node next=null;
	Node prev=null;
	
	Node(int data){
		this.data=data;
	}
	
	
}
