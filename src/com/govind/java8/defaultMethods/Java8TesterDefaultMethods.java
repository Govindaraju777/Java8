package com.govind.java8.defaultMethods;

/*
 * Default Methods for Interfaces
	Java 8 enables us to add non-abstract method implementations to interfaces by utilizing the default keyword. 
	This feature is also known as Extension Methods. 
 */
public class Java8TesterDefaultMethods {
	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}

interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle!");
	}
	
	//An interface can also have static helper methods from Java 8 onwards.
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeler {
	//First solution is to create an own method that overrides the default implementation.
	@Override
	public void print() {
		// call the default method of the specified interface using super.
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}
