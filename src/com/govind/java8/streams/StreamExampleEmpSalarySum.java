/**
 * 
 */
package com.govind.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author govindaraju.v
 *
 */
public class StreamExampleEmpSalarySum {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, 1000, "Chandra Shekhar", 6000), 
				new Employee(1, 1000, "Rajesh", 8000), new Employee(1, 1004, "Rahul", 9000),
				new Employee(1, 1001, "Suresh", 12000), new Employee(1, 1004, "Satosh", 8500));
		
		int totalSalary = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Total Salary of all employees  : " + totalSalary);
		
		//
		int totalSalaryDept1000 =  employees.stream().filter(employee->employee.getDeptId()==1000)
				.collect(Collectors.summingInt(emp->emp.getSalary()));
		System.out.println("Total Salary of all employees in DEPT 1000  : " + totalSalaryDept1000);

		
	}
}

class Employee {
	private int id;
	private int deptId;
	private String name;
	private int salary;

	public Employee(int id, int deptId, String name, int salary) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getDeptId() {
		return deptId;
	}

}