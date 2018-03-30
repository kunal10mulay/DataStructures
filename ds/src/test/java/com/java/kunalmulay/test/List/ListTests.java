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
	        assertEquals(linkedList.displayString(), "A ==> B ==> C ==> D");
	    }
}
