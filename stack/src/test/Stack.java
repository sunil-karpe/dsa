package test;

public class Stack {
	
	private Node top;
	private Node bottom;
	private int length;
	
	Stack(int value){
		this.top=new Node(value);
		this.bottom=this.top;
		this.length++;
	}
	
	Stack(){
		this.top=null;
		this.bottom=null;
		this.length=0;
	}
	
	
	//Method to get top most element in the stack
	public Stack peek(){
		return this;
	}
	
	//Method to add the element at the top most position in stack
	public Stack push(int value) {
		
		Node newNode=new Node(value);
		
		//Handling the element to be added very first time in stack
		if(this.length==0) {
			this.top=newNode;
			this.bottom=newNode;
			
		}
		
		Node temp=this.top;
		
		this.top=newNode;
		this.top.next=temp;
		
		//Incrementing the length of stack as the new element added
		this.length++;
			
		return this;
	}
	
	//Method to remove the element present at top position from the stack
	public Stack pop() {
		
		//Handling if the stack is empty and there is nothing to be removed
		if(length==0) {
			return null;
			
		}else if(length ==1) {//If there is one item present in stack before calling this function then bottom will point to null 
		//as the stack will get empty after calling this function
			this.bottom=null;
		}
		
		//top will be removed and new top will point to the second item from the top position
		this.top=this.top.next;
	
		//Decrementing the length as the item is removed from the stack
		this.length--;
		
		return this;
	
	}
	

	//Check whether the stack is empty or not
	public boolean isEmpty() {
		
			return this.length==0?true:false;
	}
	
	
	
	
	
	public String toString() {
		String data;
		
		if(length==0) {
			data="No item in stack";
			
		}else if(length==1) {
			data="Top = {"+"\n"+
					"value: "+this.top.value+"\n"+
						"next: "+null+"\n}";
		
		}else {
			data="Top = {"+"\n"+
					"value: "+this.top.value+"\n"+
						"next: "+this.top.next.value+"\n}";
			
		}
		
		return data;

		
	}
	
	
//	public void print() {
//		Node currentNode=this.top;
//		int len=this.length;
//		
//		if(this.length==0) {
//			System.out.println("Stack is empty!");
//			
//		}else {
//			while(len!=0) {
//				System.out.println(currentNode.value);
//				currentNode=currentNode.next;
//				len--;
//			}
//		}	
//		
//	}
		

}


class Node{
	
	int value;
	Node next=null;
	
	Node(int value){
		this.value=value;
		this.next=null;
	}
	Node(){}
}
