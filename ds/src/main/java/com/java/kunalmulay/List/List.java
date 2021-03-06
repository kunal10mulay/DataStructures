package com.java.kunalmulay.List;

/**
 * Interface for List
 * @author kunal mulay
 *
 * @param <T>
 */
public interface List<T> {
	
	/**
	 * Method adds a node at specific location, List is indexed from 0.
	 * @param location
	 * @return node just entered to the list
	 */
	public Node<T> addNodeAtLocation(Node<T> node, int location);
	
	/**
	 * This method returns a string of all elements of a list.
	 * 
	 * @return Returns a string of all elements of a List. 
	 */
	public String displayString();
	
	/**
	 * Display all elements of the List. Make sure to override toString method
	 * If custom object is used as an entry to List.
	 */
	public void display() ;
	
	/**
	 * Function to add a node at the end of list.
	 * Takes node to be inserted as an input
	 * @param node
	 */
	public void add(Node<T> node) ;
	
	/**
	 * Function to add a list to existing list. New List will be appended at the end
	 * of existing linked list.
	 * @param mode
	 */
	public void appendList(List<T> list);
	
	/**
	 * Contains function checks if linked list contain specified node.
	 */
	public boolean contains(Node<T> node);
	
	/**
	 * Get Node of a linked list by index.
	 * @param index
	 * @return returns node of a linked list
	 */
	public Node<T> get(int index);
	
	/**
	 * Remove Node at index
	 * @param index
	 */
	public void remove(int index);
	
	/**
	 * Remove First occurrence of Node
	 * @param node
	 */
	public void remove(Node <T> node);
	
	/**
	 * Returns length of the List
	 * @return length of list
	 */
	public int length();
 }
