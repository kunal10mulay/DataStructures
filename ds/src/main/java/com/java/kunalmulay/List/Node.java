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
	
	/**
	 * override equals method to make data equal.
	 * Implement equals method if custom object is used.
	 * @param obj
	 * @return
	 */
	public boolean equals(Node<T> obj) 
	{
		return this.data == obj.data;
	}
}