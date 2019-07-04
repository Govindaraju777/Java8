package com.govind.hashmapInternals;
import java.util.HashMap;
import java.util.Map;

public class HashMapForStringKeys {
	public static void main(String[] args) {
		
		String str0 = null;
		String str1="Narendra";
		String str2="Naveen";
		String str3="Goutham";
		String str4="Shwetha";
		String str5="V";
		
		System.out.println("HashCode for " + str1+ " = " + str1.hashCode() );
		System.out.println("HashCode for " +str2 + " = " +str2.hashCode()  );
		System.out.println("HashCode for " +str3 + " = " + str3.hashCode() );
		System.out.println("HashCode for " +str4 + " = " + str4.hashCode() );
		System.out.println("HashCode for " +str5 + " = " + str5.hashCode() );
		
		
		Map<String, Integer> propteryCounts = new HashMap<String, Integer>();
		propteryCounts.put(str0, 0);
		propteryCounts.put(str1, 1);
		propteryCounts.put(str2, 2);
		propteryCounts.put(str3, 3);
		propteryCounts.put(str4, 3);
		propteryCounts.put(str5, 3);
		
		
		System.out.println(propteryCounts);
		
	}
}
