package com.govind.hashmapInternals;
import java.util.HashMap;
import java.util.Map;

public class WorkingOfHashMap {
	public static void main(String[] args) {
		
		String str1 = "ABCDE";
		String str2 = "BACDE";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		/*
		Map<String,Integer> testNames = new HashMap<>();
		testNames.put("ABCDE", 1);
		testNames.put("BACDE", 2);
		testNames.put("BCADE", 3);
		testNames.put("BCDAE", 4);
		testNames.put("BCDEA", 5);
		testNames.put("BACDE", 6);
		testNames.put("ACBDE", 7);
		testNames.put("ACDBE", 8);
		
		testNames.get("ABCDE");
		testNames.get("BACDE");
		*/
		
		
		Employee emp1 = new Employee("1","1");
		Employee emp2 = new Employee("2","1");
		Employee emp3 = new Employee("3","1");
		Employee emp4 = new Employee("4","1");
		Employee emp5 = new Employee("5","1");
		Employee emp6 = new Employee("6","1");
		Employee emp7 = new Employee("7","1");
		Employee emp8 = new Employee("8","1");
		Employee emp9 = new Employee("9","1");
		Employee emp10 = new Employee("10","1");
		Employee emp11 = new Employee("11","1");
		Employee emp12 = new Employee("12","1");
		Employee emp13 = new Employee("13","1");
		Employee emp14 = new Employee("14","1");
		Employee emp15 = new Employee("15","1");
		Employee emp16 = new Employee("16","1");
		
		Map<Employee,Integer>  empls = new HashMap<>();
		empls.put(emp1, 1);
		empls.put(emp2, 2);
		empls.put(emp3, 3);
		empls.put(emp4, 4);
		/*empls.put(emp5, 5);
		empls.put(emp6, 6);
		empls.put(emp7, 7);
		empls.put(emp8, 8);
		empls.put(emp9, 9);
		empls.put(emp10, 10);
		empls.put(emp11, 11);
		empls.put(emp12, 12);
		empls.put(emp13, 13);
		empls.put(emp14, 14);
		empls.put(emp15, 15);
		empls.put(emp16, 16);*/
		
		
		empls.get(emp1);
		
	}
}
