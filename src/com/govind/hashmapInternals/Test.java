package com.govind.hashmapInternals;

public class Test {
	public static void main(String[] args) {
		Integer h = 18;
		int res = ( h.hashCode()) ^ (h >>> 16);
		System.out.println(res);
	}
}
