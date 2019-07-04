/**
 * 
 */
package com.govind.java8.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author govindaraju.v
 *
 */
/*
 * Functional Interface Example
 * Predicate <T> interface is a functional interface with a method test(Object) to return a Boolean value.
 * This interface signifies that an object is tested to be true or false.
 */
public class PredicateInterface {
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 eval(list, n->true);
		 
		 
		 System.out.println("Print even numbers:");
	     eval(list, ( n-> n%2 == 0 ) );
	      
	      
	}
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
	      for(Integer n: list) {
			
	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }
}
