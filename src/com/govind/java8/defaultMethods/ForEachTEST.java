package com.govind.java8.defaultMethods;

import java.util.HashMap;
import java.util.Map;
/*
 * Java 8 introduces a new concept of default method implementation in interfaces. 
 * This capability is added for backward compatibility so that old interfaces can be used to leverage 
  	the lambda expression capability of Java 8. 
  	For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ 
  	method declaration.
 */
public class ForEachTEST {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		//1.1 Normal way to loop a Map.
		/*for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}*/
		
		//1.2 In Java 8, you can loop a Map with forEach + lambda expression.
		
		items.forEach((String k,Integer v)->System.out.println("Item : " + k + " Count : " + v));
		System.out.println("-------------------------------------------------");
		items.forEach((k,v)->{
			//System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
	}
}
