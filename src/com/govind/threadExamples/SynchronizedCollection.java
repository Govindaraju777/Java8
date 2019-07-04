package com.govind.threadExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SynchronizedCollection {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		//java 7 anonymous mehtod implementation
		Collection<Integer> syncCollection1 = Collections.synchronizedCollection(new ArrayList<>());
		Runnable listOperations1 = new Runnable() {
			@Override
			public void run() {
				syncCollection1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
			}
		}; 
		Thread thread1 = new Thread(listOperations1);
		Thread thread2 = new Thread(listOperations1);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(syncCollection1.size());
		

		System.out.println("-------------------------Java 8 -----------------------");
		
		Collection<Integer> syncCollection2 = Collections.synchronizedCollection(new ArrayList<>());
		Runnable listOperations2 = () -> {
			syncCollection2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
		};

		Thread thread2_1 = new Thread(listOperations2);
		Thread thread2_2 = new Thread(listOperations2);
		thread2_1.start();
		thread2_2.start();
		thread2_1.join();
		thread2_2.join();
		System.out.println(syncCollection2.size());
		// assertThat(syncCollection.size()).isEqualTo(12);
	}
}
