package com.govind.java8.lambdaExpression;


/*
 * 
 * Java 8 - Lambda Expressions
 * Lambda expression facilitates functional programming, and simplifies the development a lot.
 * Lambda expressions are used primarily to define inline implementation of a functional interface
 * 
 * Syntax
 * A lambda expression is characterized by the 
   following syntax −
   		parameter -> expression body
 * Following are the important characteristics of a lambda expression −
	Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.
	Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.
	Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.
	Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.
 */
public class Java8Tester_Lambda {
	public static void main(String[] args) {
		
		Java8Tester_Lambda tester = new Java8Tester_Lambda();
		
		//MathOperation(interface functional interface) :  
		
		//implementation of interface
		//java7 way of anonymous class/object
		MathOperation addition1 = new MathOperation() {
			@Override
			public int operation(int a, int b) {
				return a+b;
			}
		};
		
		/*
		 *  java8 : Lambda expressions are used primarily to define inline implementation of a functional interface.
		*/
		MathOperation addition3 = (final int a,int b) ->{
			//a=4;  // final
			return a+b;	};  // with braces and type
		MathOperation addition4 = ( a, b) ->{return a+b;}; //  with braces and without type
		
		MathOperation addition2 = (int a,int b) ->a+b;  // without curly braces and with type
		MathOperation addition5 = (a,b) ->a+b;  // without curly brace and without type
		
		
		System.out.println("1.-----------------------------------\n");
		int addedVals = addition1.operation(1, 2);
		System.out.println(addedVals);
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition1));
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition2));
		
		
		System.out.println("\n2.-----------------------------------");
		 /* java8 way : anonymous implemetation
		 	Optional type declaration
		 */
	     MathOperation subtraction = (a, b) -> a - b;
		 System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));

		//with parenthesis
		 GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
		 //without parenthesis
		 GreetingService greetService1 = message ->  System.out.println("Hello " + message);
		 
		 greetService1.sayMessage("Goutham");
	     greetService2.sayMessage("Goutham");
		 
	     
	     MyLambda myLambdaPrint = () -> System.out.println("Hi..");
	 	 myLambdaPrint.display();
		 
	}
	private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	}
	
	
	
	
}

interface MyLambda{
	void display();
}

interface MathOperation{
	int operation(int a, int b);
}
interface GreetingService {
    void sayMessage(String message);
 }

