package com.govind.java8.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	static class Employee2 implements Comparable<Employee2> {
		private String name;
		private Integer salary;

		public Employee2(String name, Integer salary) {
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSalary() {
			return salary;
		}

		public void setSalary(Integer salary) {
			this.salary = salary;
		}

		@Override
		public int compareTo(Employee2 o) {
			if (this.salary < o.salary)
				return 1;
			else if (this.salary > o.salary)
				return -1;
			return 0;
		}

		@Override
		public String toString() {
			return " " + name + " " + salary;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((salary == null) ? 0 : salary.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee2 other = (Employee2) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (salary == null) {
				if (other.salary != null)
					return false;
			} else if (!salary.equals(other.salary))
				return false;
			return true;
		}

	}

	public static void main(String[] args) {
		Queue<Employee2> empQueue = new PriorityQueue<>();

		Employee2 emp1 = new Employee2("Ganesh", 2000);
		Employee2 emp2 = new Employee2("Anil", 1000);
		Employee2 emp3 = new Employee2("Akil", 3000);
		Employee2 emp4 = new Employee2("Raj", 3000);
		Employee2 emp5 = new Employee2("Raj", 8000);
		Employee2 emp6 = new Employee2("Raj", 7000);


		/*
		 * empQueue.add(emp1); empQueue.add(emp2); empQueue.add(emp2);
		 */

		empQueue.offer(emp1);
		empQueue.offer(emp2);
		empQueue.offer(emp3);
		empQueue.offer(emp4);
		empQueue.offer(emp5);
		empQueue.offer(emp6);


		empQueue.forEach(System.out::print);

		empQueue.remove();
		System.out.println("\n");
		empQueue.forEach(System.out::print);

	}
}
