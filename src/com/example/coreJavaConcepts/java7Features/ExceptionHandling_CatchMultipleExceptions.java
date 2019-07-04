/**
 * 
 */
package com.example.coreJavaConcepts.java7Features;

/**
 * 
 * Java allows you to catch multiple type exceptions in a single catch block. It
 * was introduced in Java 7 and helps to optimize code.
 * 
 * You can use vertical bar (|) to separate multiple exceptions in catch block.
 * 
 * An old, prior to Java 7 approach to handle multiple exceptions.
 *
 */
public class ExceptionHandling_CatchMultipleExceptions {
	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} //catch ( Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {The exception ArithmeticException is already caught by the alternative Exception
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
