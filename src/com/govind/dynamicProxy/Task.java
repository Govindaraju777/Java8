package com.govind.dynamicProxy;

public interface Task {
	public void setData(String data);

	public int getCalData(int x);
}
interface Task2 {
	public void setData(String data);
	public int getCalData(int x);
	public void testTask2();
}