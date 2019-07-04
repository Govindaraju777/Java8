package com.govind.reflectionapis;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflectionSetNameIfNull {
	public static void main(String[] args) {
		Employee emp1 = new Employee("11111","Goutham",null);
		
		
		
		Class noparams[] = {};
		try {
			Class<?> cls = Class.forName("com.govind.reflectionapis.Employee");
			Method method = cls.getDeclaredMethod("getCreateDate", noparams);
			Object val = method.invoke(emp1, null);

			System.out.println(val);
			
			
			Method setDate = cls.getDeclaredMethod("getCreateDate", noparams);
			method.invoke(emp1, null);
			
			
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
	}
}
