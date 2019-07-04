package com.example.coreJavaConcepts.finalkeyword;


/*
 
  1) finalize() method is defined in java.lang.Object class, which means it available to all the classes for the sake of overriding. finalize method is defined as protected which leads to a popular core java question "Why finalize is declared protected instead of public"? well, I don't know the exact reason its falls in the same category of questions like why java doesn't support multiple inheritance which can only be answered accurately by designers of Java. any way making finalize protected looks good in terms of following rule of encapsulation which starts with least restrictive access modifier like private but making finalize private prevents it from being overridden in subclass as you can not override private methods, so making it protected is next obvious choice.

		Read more: https://javarevisited.blogspot.com/2012/03/finalize-method-in-java-tutorial.html#ixzz5mbt6X88e
  2) One of the most important points of finalize method is that it's not automatically chained like constructors. If you are overriding finalize method then it's your responsibility to call finalize() method of the superclass, if you forgot to call then finalize of super class will never be called. so it becomes critical to remember this and provide an opportunity to finalize of super class to perform cleanup. The best way to call superclass finalize method is to call them in the finally block as shown in below example. This will guarantee that finalize of the parent class will be called in all condition except when JVM exits:

	3) finalize method is called by garbage collection thread before collecting object and if not intended to be called like a normal method

4) finalize gets called only once by GC thread if object revives itself from finalize method than finalize will not be called again.

5) Any Exception is thrown by finalize method is ignored by GC thread and it will not be propagated further, in fact, I doubt if you find any trace of it.


	Alternative of finalize method for cleanup.
		So far its seems we are suggesting not to use finalize method because of its non-guaranteed behavior but than what is alternative of releasing resource, performing cleanup because there is no destructor in Java. Having a method like close() or destroy() make much sense for releasing resources held by classes. In fact, JDK library follows this.
			Java 7 has added automatic resource management feature which takes care of closing all resource opened inside try block automatically.
 */
public class TestFinalizeGC {
	public static void main(String[] args) throws Exception {
		// Creating two instances of class A

		A a1 = new A();

		A a2 = new A();

		// Assigning a2 to a1

		a1 = a2;

		// Now both a1 and a2 will be pointing to same object

		// An object earlier referred by a1 will become abandoned

		System.gc(); // OR call Runtime.getRuntime().gc();
		System.out.println("done");
	}

}

class A {
	int i = 50;

	//An Example of a constructor that throws an exception
	public A() throws Exception {
		if(i>50) {
			throw new Exception();
		}
		System.out.println("A  constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("From Finalize Method");
	}
}