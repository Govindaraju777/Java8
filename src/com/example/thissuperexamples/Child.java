package com.example.thissuperexamples;

class Parent extends Object {

	protected int i = 2;

	{
		System.out.println("initialization block. Parent");
	}  
	
	public Parent() {
		System.out.println("Parent");
	}
	public Parent(int i) {
		System.out.println("Parent2");
	}

}

public class Child extends Parent {
	private int i=2;

	
	{
		System.out.println("initialization block. Child");
	}  
	
	
	public Child() {
		super(2);
		System.out.println("value of i=" + i);
		System.out.println("value of i=" + this.i);
		System.out.println("value of i=" + super.i);
		i = 3;
		System.out.println("");
	}

	public static void main(String[] args) {
		Child childObj = new Child();
		System.out.println("i " + childObj.i);
	}

}