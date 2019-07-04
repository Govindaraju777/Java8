/**
 * 
 */
package com.govind.java8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author govindaraju.v
 *
 */
public class Java8Introduction_to_funcInterfacesAndLambda {
	public static void main(String[] args) {

		List<String> names1 = new ArrayList<>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");

		List<String> names2 = new ArrayList<>();
		names2.add("Mahesh ");
		names2.add("Suresh ");
		names2.add("Ramesh ");
		names2.add("Naresh ");
		names2.add("Kalpesh ");

		// sort using java7
		sortUsingJava7(names1);

		// sort using java8
		sortUsingJava8(names2);

		System.out.println(names1);
		System.out.println(names2);

		System.out.println("start : ---------------- Print Coinditionally------------------");
		// Conditional print
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Govindaraju", "1"));
		emps.add(new Employee("Goutham", "2"));
		emps.add(new Employee("Raja", "3"));

		// java-7. With user defined functional interface.
		printConditionallyJava8CustomPrediction(emps, new MyCondition() {
			@Override
			public boolean test(Employee emp) {
				return emp.getName().startsWith("G");
			}
		});

		// using java-8 Custom - Function Interfaces
		printConditionallyJava8CustomPrediction(emps, e -> e.getName().startsWith("G"));

		// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		// using java-8 Predicate
		printConditionallyJava8Prediction(emps, e -> e.getName().startsWith("G"));

		
		printConditionallyJava8PredictionAndConsumerFunction(emps, e -> e.getName().startsWith("G"), e -> System.out.println(e));
		printConditionallyJava8PredictionAndConsumerFunction(emps, e -> e.getName().startsWith("G"), System.out::println);

		System.out.println("End : ---------------- Print Coinditionally------------------");

	}

	private static void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}

	// {} and return optional for one line // method.
	private static void sortUsingJava8_(List<String> names) {
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});
	}

	// java8 - For one line method bodies you can skip both the braces {} and
	// the return keyword
	private static void sortUsingJava8(List<String> names) {
		Collections.sort(names, (String s1, String s2) -> s1.compareTo(s2));
	}

	// print conditionally
	private static void printConditionallyJava8CustomPrediction(List<Employee> emps, MyCondition condition) {
		for (Employee emp : emps) {
			if (condition.test(emp)) {
				System.out.println(emp);
			}
		}
	}

	// print conditionally : Using inbuilt @predicate - Functional interface
	// that returns boolean.
	private static void printConditionallyJava8Prediction(List<Employee> emps, Predicate<Employee> condition) {
		for (Employee emp : emps) {
			if (condition.test(emp)) {
				System.out.println(emp);
			}
		}
	}

	// print conditionally : Using inbuilt @Predicate and @Consumer - Functional
	// interface that returns boolean.
	private static void printConditionallyJava8PredictionAndConsumerFunction(List<Employee> emps, Predicate<Employee> condition, Consumer<Employee> consumer) {
		for (Employee emp : emps) {
			if (condition.test(emp)) {
				consumer.accept(emp);
				// System.out.println(emp);
			}
		}
	}

}

class Employee {
	private String name;
	private String id;

	Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ((name != null ? name : "") + " " + (id != null ? id : ""));
	}
}

@FunctionalInterface
interface MyCondition {
	boolean test(Employee emp);
}