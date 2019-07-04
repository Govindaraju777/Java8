package com.example.coreJavaConcepts.java7Features;

public class ExceptionHandling_Rethrow {
	public static void main(String[] args) throws Exception {
		new TryCatch().test();
	}
}

class TryCatch {

	/*
	 * The problem here is that the method is catching the generic
	 * java.lang.Exception, but indicating that it only throws the very specific
	 * exceptions OpenException and CloseException. In Java 6, you would need to
	 * add java.lang.Exception to the method signature, but in Java 7, you do
	 * not.
	 */
	public void test() throws OpenException,CloseException {
		boolean flag = true;
		try {
			if (flag) {
				throw new OpenException();
			} else {
				throw new CloseException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}

class OpenException extends Exception {
}

class CloseException extends Exception {
}