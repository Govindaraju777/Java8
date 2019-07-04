package com.govind.java8.collection.setExample;

import java.util.Iterator;
import java.util.TreeSet;

/*
 TreeSet 
 	- Implements tree structure (Red-black tree )
 	
 - The elements in a set are sorted.
 	but the add, remove , and contains methods has time complexity of O(log n)
 	
 - Mehtod : first(),last(), headSet(), tailSet() etc..	
 	
 -- object used in treeset must implement comparable .
 * 
 */
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		//tree.add(null); //main" java.lang.NullPointerException
		tree.add(125);
		tree.add(15);
		tree.add(55);
		tree.add(40);
		tree.add(100);
		tree.add(25);
		tree.add(35);
		tree.add(1000);
		tree.add(2000);

		Iterator<Integer> iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("min = " + tree.first());
		System.out.println("max = " + tree.last());
		System.out.println("headSet , set< 1000 i.e numbers less than 1000 = "+ tree.headSet(1000));
		System.out.println("tailSet , set>=1000 i.e numbers less thanAndEq 1000 = "+ tree.tailSet(1000));
		System.out.println("last 3 max [ " + tree.pollLast() + " " + tree.pollLast() + " " + tree.pollLast() + " ]");

	}
}
