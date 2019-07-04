package com.govind.java8.collection.setExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 public class LinkedHashSet<E> extends HashSet<E> 
  
 */
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHs = new LinkedHashSet<>();
		linkedHs.add(10);
		linkedHs.add(10);
		linkedHs.add(18);
		linkedHs.add(8);

		Iterator<Integer> iterator = linkedHs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
