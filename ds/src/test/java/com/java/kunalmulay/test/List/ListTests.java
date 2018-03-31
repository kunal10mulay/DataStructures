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

	@Test
	public void getFromList() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(new Node<String>("A"));
		linkedList.add(new Node<String>("B"));
		linkedList.add(new Node<String>("C"));
		linkedList.add(new Node<String>("D"));
		linkedList.add(new Node<String>("E"));

		assertTrue(linkedList.get(2).equals(new Node<String>("C")));

		// assert true if exception is produced
		try {
			linkedList.get(10);
		} catch (RuntimeException e) {
			assertTrue("Got exception", true);
		}
	}

	@Test
	public void removeFromListByindex() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(new Node<String>("A"));
		linkedList.add(new Node<String>("B"));
		linkedList.add(new Node<String>("C"));
		linkedList.add(new Node<String>("D"));
		linkedList.add(new Node<String>("E"));
		linkedList.remove(0);

		assertEquals(linkedList.displayString(), "B : C : D : E");

		// assert true if exception is produced
		try {
			linkedList.remove(10);
		} catch (RuntimeException e) {
			assertTrue("Got exception", true);
		}

		try {
			new LinkedList<String>().remove(0);
		} catch (RuntimeException e) {
			assertTrue("Got exception", true);
		}

		try {
			new LinkedList<String>().remove(-1);
		} catch (RuntimeException e) {
			assertTrue("Got exception", true);
		}
	}

	@Test
	public void removeFromListByNode() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(new Node<String>("A"));
		linkedList.add(new Node<String>("B"));
		linkedList.add(new Node<String>("C"));
		linkedList.add(new Node<String>("D"));
		linkedList.add(new Node<String>("E"));
		linkedList.remove(new Node<String>("A"));

		assertEquals(linkedList.displayString(), "B : C : D : E");

		linkedList.remove(new Node<String>("C"));

		assertEquals(linkedList.displayString(), "B : D : E");

		linkedList.remove(new Node<String>("E"));

		assertEquals(linkedList.displayString(), "B : D");
	}

	@Test
	public void lengthOfList() {
		LinkedList<String> linkedList = new LinkedList<>();

		assertEquals(linkedList.length(), 0);

		linkedList.add(new Node<String>("A"));
		linkedList.add(new Node<String>("B"));
		linkedList.add(new Node<String>("C"));
		linkedList.add(new Node<String>("D"));
		linkedList.add(new Node<String>("E"));

		assertEquals(linkedList.length(), 5);

	}
	
	@Test
	public void nthfromlast() {
		LinkedList<String> linkedList = new LinkedList<>();

		assertEquals(linkedList.length(), 0);

		linkedList.add(new Node<String>("A"));
		linkedList.add(new Node<String>("B"));
		linkedList.add(new Node<String>("C"));
		linkedList.add(new Node<String>("D"));
		linkedList.add(new Node<String>("E"));

		assertTrue(linkedList.nthFromEnd(5).equals(new Node<String>("A")));

	}

}
