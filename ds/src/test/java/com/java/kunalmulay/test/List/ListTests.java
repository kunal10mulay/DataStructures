package com.java.kunalmulay.test.List;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.kunalmulay.List.LinkedList;
import com.java.kunalmulay.List.Node;

public class ListTests {

	 @Test
	 public void addAndDisplayLinkedList() {
	       LinkedList<String> linkedList = new LinkedList<>();
	       linkedList.add(new Node<String>("A"));
	       linkedList.add(new Node<String>("B"));
	       linkedList.add(new Node<String>("C"));
	       linkedList.add(new Node<String>("D"));
	       
	        // assert statement
	        assertEquals(linkedList.displayString(), "A : B : C : D");
	    }
	 
	 @Test
	 public void addToListAtLocation() {
		   LinkedList<String> linkedList = new LinkedList<>();
	       linkedList.addNodeAtLocation(new Node<String>("A"), 0);
	       linkedList.addNodeAtLocation(new Node<String>("C"), 1);
	       linkedList.addNodeAtLocation(new Node<String>("B"), 1);
	       linkedList.add(new Node<String>("D"));
	       linkedList.addNodeAtLocation(new Node<String>("E"), 4);
	       
	       assertEquals(linkedList.displayString(), "A : B : C : D : E");
	 }
	 
	 @Test
	 public void appendList() {
		 LinkedList<String> linkedList = new LinkedList<>();
		 linkedList.add(new Node<String>("A"));
	     linkedList.add(new Node<String>("B"));
	     linkedList.add(new Node<String>("C"));
	     
		 LinkedList<String> linkedList2 = new LinkedList<>();
		 linkedList2.add(new Node<String>("D"));
	     linkedList2.add(new Node<String>("E"));
	     linkedList2.add(new Node<String>("F"));
	     
	     linkedList.appendList(linkedList2);
	     assertEquals(linkedList.displayString(), "A : B : C : D : E : F");
	 }
	 
	 @Test
	 public void containsList() {
		 LinkedList<String> linkedList = new LinkedList<>();
		 linkedList.add(new Node<String>("A"));
	     linkedList.add(new Node<String>("B"));
	     linkedList.add(new Node<String>("C"));
		 linkedList.add(new Node<String>("D"));
	     linkedList.add(new Node<String>("E"));
	     
	     assertEquals(linkedList.contains(new Node<String>("C")), true);
	     assertEquals(linkedList.contains(new Node<String>("F")), false);
	 }
}
