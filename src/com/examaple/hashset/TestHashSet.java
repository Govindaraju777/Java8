/**
 * 
 */
package com.examaple.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * @author govindaraju.v
 *
 */
/*
 * hashmap is internally backed hashmap.
 */
public class TestHashSet {

	public static void main(String[] args) {
		Employee emp1  = new Employee();
		Set<Employee> empSets = new HashSet<>();
		empSets.add(emp1);
		empSets.add(emp1);
		
		Employee emp2  = new Employee();
		empSets.add(emp2);

		System.out.println(empSets.size());
		
	}

}
