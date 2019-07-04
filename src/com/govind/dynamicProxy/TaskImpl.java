package com.govind.dynamicProxy;

public class TaskImpl implements Task,Task2{
	@Override
	public void setData(String data) {
		System.out.println(data + " Data is saved");
	}

	@Override
	public int getCalData(int x) {
		return x * 10;
	}

	@Override
	public void testTask2() {
		System.out.println("task2");
	}
}