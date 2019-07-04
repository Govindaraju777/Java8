package com.example.coreJavaConcepts.java7Features;

/*
 In Java 7, Java allows you to use string objects in the expression of switch statement. 
 In order to use string, you need to consider the following points: 
  	It must be only string object.
  	String game = "Hockey"; // It is OK.  
  	No Null object
  	
 * 
 */
public class SwitchString {

	public static void main(String[] args) {
		String game = "Cricket";
		switch (game) {
		case "Hockey":
			System.out.println("Let's play Hockey");
			break;
		case "Cricket":
			System.out.println("Let's play Cricket");
			break;
		case "Football":
			System.out.println("Let's play Football");
		}
	}
}
