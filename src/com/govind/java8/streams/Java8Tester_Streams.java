package com.govind.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Stream is a new abstract layer introduced in Java 8. 
      Using stream, you can process data in a declarative way similar to SQL statements.
 * Processing Data with Java SE 8 Streams
 * Process really large collections efficiently? Ideally, to speed up the processing
 * stream that lets the developer to process data declaratively 
 * writing parallel code is hard and error-prone.  
 	and leverage multicore architecture without the need to write any specific code for it.
 	sees picture : http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 */
public class Java8Tester_Streams {
	public static void main(String[] args) {
		// Count empty strings
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("List: " + strings);

		
		//stream is lazy , cannot use twice
		Stream<String> steram = strings.stream(); 
		steram.forEach(System.out::print);
		//steram.forEach(System.out::print); //java.lang.IllegalStateException: stream has already been operated upon or closed
		
		
		
		long count = getCountEmptyStringUsingJava7(strings);
		System.out.println("Empty Strings: " + count);

		System.out.println("Using Java 8: ");
		count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);
		

	     count = strings.stream().filter(string -> string.length() == 3).count();
         System.out.println("Strings of length 3: " + count);
		
         //Collectors are used to combine the result of processing on the elements of a stream.
         List<String> filtered = null;
         filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
         System.out.println("Filtered List: " + filtered);
          
	      //‘filter’ method is used to eliminate elements based on a criteria.
          String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
	      System.out.println("Merged String Using java8: " + mergedString);
		
	      System.out.println("-------------------------------------------------------");
	      
	      //A state object for collecting statistics such as count, min, max, sum, and average.
	      //map
	      List<Integer> integers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	      IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
	      System.out.println("Highest number in List : " + stats.getMax());
	      System.out.println("Lowest number in List : " + stats.getMin());
	      System.out.println("Sum of all numbers : " + stats.getSum());
	      System.out.println("Average of all numbers : " + stats.getAverage());
	      System.out.println("Random Numbers: ");
	      System.out.println("-------------------------------------------------------");

	      //The ‘limit’ method is used to reduce the size of the stream
	      //The ‘sorted’ method is used to sort the stream. 
	      Random random = new Random();
	      random.ints().limit(5).sorted().forEach(System.out::println);
	      
	      //Parallel Processing
	      //parallelStream is the alternative of stream for parallel processing
	    
	      System.out.println("-------------------------------------------------------");
	      List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	      //get count of empty string
	      int count2 = (int) strings2.parallelStream().filter(string -> string.isEmpty()).count();
	      System.out.println("count2 = " + count2);
	      System.out.println("-------------------------------------------------------");
	      
	      
	      System.out.println("\nreduce: The reduce method is used to reduce the elements of a stream to a single value.\n" + 
	      		"The reduce method takes a BinaryOperator as a parameter.\n");
	      List<Integer> number = Arrays.asList(2,3,4,5);
	      //sum if the number is even.
	      int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	      System.out.println(even);

	      
	      System.out.println("-------partitioningBy--------\n\n\n");
	      //
	      String[] givenLisarray = {"a", "bb", "dd","123"};
	      List<String> givenList = Arrays.asList(givenLisarray);
	      Map<Boolean, List<String>> result = givenList.stream().collect(Collectors.partitioningBy(s -> s.length() > 2));
	      System.out.println(result);
	      
	}
	 private static String getMergedStringUsingJava7(List<String> strings, String separator){
	      StringBuilder stringBuilder = new StringBuilder();
			
	      for(String string: strings){
			
	         if(!string.isEmpty()){
	            stringBuilder.append(string);
	            stringBuilder.append(separator);
	         }
	      }
	      String mergedString = stringBuilder.toString();
	      return mergedString.substring(0, mergedString.length()-2);
	   }
	private static int getCountEmptyStringUsingJava7(List<String> strings) {
		int count = 0;
		for (String string : strings) {
			if (string.isEmpty()) {
				count++;
			}
		}
		return count;
	}
}
