/**
 * 
 */
package com.govind.java8.MethodReference;

import java.util.ArrayList;
import java.util.List;

/**
 * @author govindaraju.v
 *
 */
public class MethodReference {
	public static void main(String args[]){
	      List names = new ArrayList();
	      names.add("Prabhakar");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Narendra");
	      
	      names.forEach(System.out::println);
	      
	      
	   }
}
