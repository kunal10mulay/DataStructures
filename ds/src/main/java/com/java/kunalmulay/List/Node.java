package com.java.kunalmulay.List;

/**
 * Node class specifies node in a LinkedList
 * @author kunal mulay
 *
 * @param <T>
 */
public class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}
