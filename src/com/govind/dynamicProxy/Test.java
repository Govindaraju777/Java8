package com.govind.dynamicProxy;
public class Test {
	public static void main(String[] args) {
		Object dynamicProxyObj = ProxyFactory.newInstance(new TaskImpl());
		Task2 task = (Task2)dynamicProxyObj;
		task.setData("Test");
		System.out.println(task.getCalData(5));
		task.testTask2();
	}
}