/**
 * 
 */
package com.example.colllection.workingDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author govindaraju.v
 *
 */
public class ArrayListWorkingFlow {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(10);

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);

		/*
		 * if addition of new element cannot be fit into the internal transient
		 * Object[] elementData; // non-private to simplify nested class access
		 * 
		 * size is increase oldSize * 2/3 +1 ; 10 *( 3/2 ) + 1 = 16 is new size
		 * array elementData = Arrays.copyOf(elementData, newCapacity);
		 * 
		 * in Java 7+ size new size is int newCapacity = oldCapacity +
		 * (oldCapacity >> 1); thus increase capaity by 50 %
		 * 
		 */

		// insert element in middle start,position
		// requires lot of shifting..
		nums.add(2, 20);

		nums.forEach(ele -> System.out.print(" " + ele));

		// similarly deleting from middle,/start poition also shifting happens
		nums.remove(2);

		/* Bad for Insertion / Deletion. 
		 * if insertion/removal from the middle of the collection ArrayList is
		 * bad choice System.out.println(""); nums.forEach(ele ->
		 * System.out.print(" " + ele));
		 */

		/*
		 * Good for retrieving : ArrayList is good for retrieval because it implements RandomAccess interface.
		 * Retrieving the element from position. time is
		 * always same irrespective of size and position because arrayList
		 * implements RandomAccess Marker interface.
		 */
		System.out.println("\n number at positon 1 : " + nums.get(1));

	}
}
