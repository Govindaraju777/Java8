package com.govind.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object implObject;

	public MyInvocationHandler(Object implObject) {
		this.implObject = implObject;
	}

	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		Object result;
		try {
			if (m.getName().indexOf("get") > -1) {
				System.out.println("...get Method Executing...");
			} else {
				System.out.println("...set Method Executing...");
			}
			result = m.invoke(implObject, args);
		} catch (InvocationTargetException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
}
