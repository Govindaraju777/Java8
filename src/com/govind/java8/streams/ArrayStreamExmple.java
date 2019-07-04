package com.govind.java8.streams;

import java.util.Arrays;

public class ArrayStreamExmple {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(intArray).sum();
		System.out.println("sum = " + sum);

		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		int sum2 = Arrays.stream(integerArray).mapToInt(Integer::intValue).sum();
		System.out.println("sum Wrapper type = " + sum2);
	}
}
