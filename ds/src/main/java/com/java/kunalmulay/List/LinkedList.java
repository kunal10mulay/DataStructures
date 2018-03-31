package com.java.kunalmulay.List;

/**
 * A Single Linked list implementation and some operations
 * on this list. 
 * @author kunal mulay
 *
 * @param <T>
 */
public class LinkedList<T> implements List<T> {
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
	 * Set head of a linked List.
	 * @return
	 */
	public void setHead(Node<T> head) {
		this.head = head;
	}

	@Override
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
	
	public void display() {
		Node<T> current = head;
		while(current.next != null) {
			System.out.print(current.data + " : ");
			current = current.next;
		}
		System.out.println(current.data);
	}
	
	public String displayString() {
		Node<T> current = head;
		StringBuffer buffer = new StringBuffer();
		while(current.next != null) {
			buffer.append(current.data + " : ");
			current = current.next;
		}
		buffer.append(current.data);
		return buffer.toString();
	}
	
	@Override
	public Node<T> addNodeAtLocation(Node<T> node, int location){
		Node<T> current = getHead();
		int count = 1;
		if(current == null && location == 0) {
			setHead(node);
			node.next = current;
		}
		else if(current == null && location != 0){
			throw new RuntimeException("Could not add a node to location " + location +
					 " because list is empty" );
		}
		else {
			while(current.next != null && count<location) {
				count++;
				current = current.next;
			}
			if(location > count)
				throw new RuntimeException("List out of index");
			else {
				Node <T> temp = current.next;
				current.next = node;
				node.next = temp;
			}
		}
		return node;
	}

	@Override
	public void appendList(List<T> list) {
		Node <T> current = getHead();
		while(current.next != null)
			current = current.next;
		if(list instanceof LinkedList ) {
			current.next = ((LinkedList<T>) list).getHead();
		}else {
			throw new RuntimeException("Incompatible lists provided");
		}	
	}

}
