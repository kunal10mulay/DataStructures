package com.java.kunalmulay.List;

/**
 * A Single Linked list implementation and some operations
 * on this list. 
 * @author kunal mulay
 *
 * @param <T>
 */
public class LinkedList <T> {
	private Node<T> head;
	
	/**
	 * A linked list object can be create by providing
	 * a starting or head node. 
	 * @param node
	 */
	public LinkedList(Node<T> node){
		this.head = node;
	}
	
	/**
	 * Default constructor where head is null.
	 */
	public LinkedList(){
	}
	
	/**
	 * Get head of a linked List.
	 * @return
	 */
	public Node<T> getHead() {
		return head;
	}

	/**
	 * Function to add a node at the end of list.
	 * Takes node to be inserted as an input
	 * @param node
	 */
	public void add(Node<T> node) {
		if (this.head == null)
			head = node;
		else {
			Node<T> current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}
	
	/**
	 * Display all elements of the List. Make sure to override toString method
	 * If custom object is used as an entry to linkedlist.
	 */
	
	public void display() {
		Node<T> current = head;
		while(current.next != null) {
			System.out.print(current.data + " ==> ");
			current = current.next;
		}
		System.out.println(current.data);
	}
	
	
	public String displayString() {
		Node<T> current = head;
		StringBuffer buffer = new StringBuffer();
		while(current.next != null) {
			buffer.append(current.data + " ==> ");
			current = current.next;
		}
		buffer.append(current.data);
		return buffer.toString();
	}
	
}
