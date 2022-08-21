package test;

public class Queue {

	private Node first;
	private Node last;
	private int length;

	Queue() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}

	Queue(String value) {
		Node newNode = new Node(value);
		this.first = newNode;
		this.last = newNode;
		this.length++;
	}

	// Add element to the queue
	public Queue push(String value) {
		Node newNode = new Node(value);
		if (this.first == null && this.last == null) {
			this.first = newNode;
			this.last = newNode;
			length++;
			return this;
		}

		this.last.next = newNode;
		this.last = newNode;
		this.length++;

		return this;

	}

	// Remove element from the queue (from the first location)
	public Queue dequeue() {
		if (this.first != null) {
			this.first = this.first.next;
			length--;
		}
		return this;
	}

	// Getting the item added very first in queue
	public String peek() {

		return this.first.value;
	}

	// Check whether the queue is empty or not
	public boolean isEmpty() {

		return this.length == 0 ? true : false;
	}

	// Below methods are just for testing purpose and should not be included to the
	// queue.

	public String getLast() {
		return this.last == null ? null : this.last.value;
	}

	public int size() {
		return this.length;
	}

}

class Node {

	String value;
	Node next;

	Node(String value) {

		this.value = value;
		this.next = null;

	}

	Node() {
		value = null;
		next = null;
	}
}
