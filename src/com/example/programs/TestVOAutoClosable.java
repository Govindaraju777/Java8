package com.example.programs;

public class TestVOAutoClosable implements AutoCloseable {

	
	public TestVOAutoClosable() {
		System.out.println("Object created.. End of TestVOAutoClosable.Constructor");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Auto closed");
	}

}
