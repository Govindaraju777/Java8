package com.govind.java8.collection;

import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
 
  public class LinkedList<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
  
 */
public class LinkedListExample {
	public static void main(String[] args) {
		// Creating object of class linked list
		LinkedList<String> object = new LinkedList<String>();

		// Adding elements to the linked list
		object.add("A"); // A
		object.add("B"); // A-B
		object.addLast("C"); // A-B-C
		object.addFirst("D"); // D-A-B-C
		object.add(2, "E"); // D-A-E-B-C
		object.add("F"); // D-A-E-B-C-F
		object.add("G"); // D-A-E-B-C-F
		System.out.println("Linked list : " + object);

		// Removing elements from the linked list
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		System.out.println("Linked list after deletion: " + object);

		// Finding elements in the linked list
		boolean status = object.contains("E");

		if (status)
			System.out.println("List contains the element 'E' ");
		else
			System.out.println("List doesn't contain the element 'E'");

		// Number of elements in the linked list
		int size = object.size();
		System.out.println("Size of linked list = " + size);

		// Get and set elements from linked list
		Object element = object.get(2);
		System.out.println("Element returned by get() : " + element);
		object.set(2, "Y");
		System.out.println("Linked list after change : " + object);

		System.out.println("" + object.get(4));

	}
}
