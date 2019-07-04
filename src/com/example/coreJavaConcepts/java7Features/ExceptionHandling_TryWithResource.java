package com.example.coreJavaConcepts.java7Features;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 In Java, the try-with-resources statement is a try statement that declares one or more resources. 
 The resource is as an object that must be closed after finishing the program. 
 
You can pass any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable.



 */
public class ExceptionHandling_TryWithResource {
	public static void main(String args[]) {
		// Using try-with-resources
		try (FileOutputStream fileOutputStream = new FileOutputStream("/java7-new-features/src/abc.txt")) {
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // converting string into byte
												// array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println("catch Using try-with-resources - " + exception);
		} finally {
			System.out.println("Finally executes after closing of declared resources.");
		}

		// try with resource custom class
		try (MyResource resource1 = new MyResource("res1"); MyResource resource2 = new MyResource("res2")) {
			System.out.println("within try with Resource block.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		//jdbc in java 1.7
		/*
		try(// --------------try-with-resources begin-------------//  
	            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","mysql");  
	            Statement stmt=con.createStatement(); ResultSet rs=stmt.executeQuery("select * from user");  
	      )
		*/
	}
}

class MyResource implements AutoCloseable {
	String resourceName;

	public MyResource(String resName) {
		resourceName = resName;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closed MyResource : " + resourceName);
	}
}
