package com.example.programs;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		
		lst.add("A");
		lst.add("Z");
		lst.add("ABC");
		lst.add("ABC");
		lst.add("ABCD");
		lst.add("ABCD");
		lst.add("ABCE");
		lst.add("ABC");
		lst.add("ABCD");
		lst.add("ABCD");
		lst.add("Z");

		for(int index1=0;index1<lst.size();index1++){
			String s1=lst.get(index1);
			for(int index2=index1+1;index2<lst.size();index2++){
				String s2=lst.get(index2);
				if(s1.equals(s2)){
					if(index1!=index2){
						System.out.println("duplicate : " + s2);
						lst.remove(index2);
						index2--;
					}
				}
			}
		}
		System.out.println("Distinct after removing duplicates List " + lst);
	}
	
	
}
