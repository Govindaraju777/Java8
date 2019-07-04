/**
 * 
 */
package com.example.programs;

import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author govindaraju.v
 *
 */
public class ArmStrongNumber {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int origNum=number;
		
		String s = Integer.toString(origNum);
		
		int sum = 0;
		while(number>0){
			int rem = number%10;
			//System.out.println(rem);
			sum=(int) (sum+Math.pow(rem, s.length()));
			number=number/10;
		}
		if(sum==origNum){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
	
	
}
