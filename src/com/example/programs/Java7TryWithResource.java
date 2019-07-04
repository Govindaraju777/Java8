package com.example.programs;


/*
 * 
 * Support for try-with-resources – introduced in Java 7 – allows us to declare resources to be used in a try block 
 * with the assurance that the resources will be closed when after execution of that block. 
 * The resources declared must implement the AutoCloseable interface.
 */

public class Java7TryWithResource {
	public static void main(String[] args) {
		/*	try(BufferedReader br = new BufferedReader(new FileReader(""))){
			
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		try(TestVOAutoClosable test = new TestVOAutoClosable() ){
			System.out.println("with TryWith Resource try block..");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("with TryWith Resource finally block..");
		}
		
	}
}
