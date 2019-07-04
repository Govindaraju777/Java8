package com.govind.java8.collection;

import java.util.ArrayList;
import java.util.Collections;


/*
 
  ArrayList & Vector classes implement RandomAccess Marker Interface, hence they are fast 
  in searcing the required element.
  
  
  List ( ArrayList and Vector are best for search) but worst for insertion , deletion in the middle of the
  list , which requires shifting operation..
  
  LinkedList if faster in case of insertion/deletion in the middle of the colleciton.
  
 */
public class ArrayListExample {
	public static void main(String args[]) {
		
		//How to initialize an ArrayList
		/* ArrayList<Type> obj = new ArrayList<Type>(
		        Arrays.asList(Object o1, Object o2, Object o3, ....so on));
		 */
		/*
		ArrayList<T> obj = new ArrayList<T>(){{
			   add(Object o1);
			   add(Object o2);
			   add(Object o3);
	                   ...
	                   ...
			   }};
		*/
		
		/*
		  list.add(1);
		 
		 */
		
		
		//Method 4: Use Collections.ncopies
		ArrayList<String> nCopiesArrayList = new ArrayList<String>(Collections.nCopies(2, "test") );
		System.out.println("nCopies = " + nCopiesArrayList);
		
		/*
		 * Creating ArrayList of type "String" which means we can only add
		 * "String" elements
		 */
		ArrayList<String> names = new ArrayList<String>();

		/* This is how we add elements to an ArrayList */
		names.add("Ajeet");
		names.add("Harry");
		names.add("Chaitanya");
		names.add("Steve");
		names.add("Anuj");

		
		
		
		
		// Displaying elements
		System.out.println("Original ArrayList:");
		for (String str : names)
			System.out.println(str);

		/*
		 * Add element at the given index obj.add(0, "Rahul") - Adding element
		 * "Rahul" at first position obj.add(1, "Justin") - Adding element
		 * "Justin" at second position
		 */
		names.add(0, "Rahul");
		names.add(1, "Justin");

		// Displaying elements
		System.out.println("ArrayList after add operation:");
		for (String str : names)
			System.out.println(str);

		// Remove elements from ArrayList like this
		names.remove("Chaitanya"); // Removes "Chaitanya" from ArrayList
		names.remove("Harry"); // Removes "Harry" from ArrayList

		// Displaying elements
		System.out.println("ArrayList after remove operation:");
		for (String str : names)
			System.out.println(str);

		// Remove element from the specified index
		names.remove(1); // Removes Second element from the List

		// Displaying elements
		System.out.println("Final ArrayList:");
		for (String str : names)
			System.out.println(str);
		
		
		//indexOf int indexOf(Object o): 
		//Gives the index of the object o. If the element is not found in the list then this method returns the value -1.
		
		System.out.println("indexOf Tom " + names.indexOf("Ajeet"));
		
		//update the object of arrayList in positon
		names.set(0, "Govind");
		System.out.println(names);
		
		
		//get object from arrayList using position
		System.out.println("names at index 0 = "+names.get(0));
		
		//boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.
		//clear(): It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.
		
		
		
	}
}
