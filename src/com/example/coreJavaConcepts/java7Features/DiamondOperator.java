package com.example.coreJavaConcepts.java7Features;

import java.util.ArrayList;
import java.util.List;

/*
 Type Inference for Generic Instance Creation
Now, you can replace the type arguments with an empty set of type parameters (<>). 
This pair of angle brackets is informally called the diamond. 

The following approach is used in Java 6 and prior version.
Ex. List<Integer> list  = new ArrayList<Integer>();  
	
Now, you can use the following new approach introduced in Java 7.
Ex. List<Integer> list = new ArrayList<>(); // Here, we just used diamond  



 */
public class DiamondOperator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	}
}
