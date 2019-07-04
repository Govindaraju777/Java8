package com.example.coreJavaConcepts.java7Features;

/*
 Java added a new feature Binary Literal in Java 7. 
 It allows you to express integral types (byte, short, int, and long) in binary number system. 
 To specify a binary literal, add the prefix 0b or 0B to the integral value. 
  
 */
public class Literals_BinaryLiterals {
	public static void main(String[] args) {
		byte b1 = 0b101; // Using b0, The b can be lower or upper case
		byte b2 = 0B101; // Using B0

		short s1 = 0b101; // Using b0, The b can be lower or upper case
		short s2 = 0B101; // Using B0

		// Binary literal in long type
		long l1 = 0b0000011111100001; // Using b0, The b can be lower or upper
										// case
		long l2 = 0B0000011111100001; // Using B0

		long l3 = 0b11111100001; // Using b0, The b can be lower or upper case

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("l3 = " + l3);

	}
}
