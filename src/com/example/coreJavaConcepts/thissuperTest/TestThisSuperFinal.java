package com.example.coreJavaConcepts.thissuperTest;

public class TestThisSuperFinal {
	public static void main(String[] args) {
		A a = new B();
	}
}

class A {

	{
		System.out.println("Constructor block of A class");
	}

	protected final int aVal = 1;

	public A() {
		System.out.println("A Default constructor");
	}

	public A(int tst) {
		System.out.println("A parameterized constructor");
	}
}

class B extends A {
	protected int aVal;

	{
		System.out.println("Constructor block of B class");
	}

	public B() {
		// implicit super() - > First Line implicitly calls default constructor
		// of parent class
		this(2); // explict call to this.B parameterized constructor
		System.out.println("B()");
	}

	public B(int b) {
		// implicit super() - > calls default constructor of parent class
		System.out.println(" B(int b) ");
	}

	public void test() {
		// super.aVal=2; // compiler error
		aVal = 2;
		System.out.println("valueOfA" + aVal);
	}
}