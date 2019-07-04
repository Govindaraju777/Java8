package com.govind.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javafx.scene.shape.Path;

/* Stream is a new abstract layer introduced in Java 8. 
Using stream, you can process data in a declarative way similar to SQL statements.
* Processing Data with Java SE 8 Streams
* Process really large collections efficiently? Ideally, to speed up the processing
* stream that lets the developer to process data declaratively 
* writing parallel code is hard and error-prone.  
and leverage multicore architecture without the need to write any specific code for it.
sees picture : http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
*/

/*
 * Streams can be created from Arrays, List, set , lines of file..
 */
public class Example_1 {

	public static void main(String[] args) {
		
		//1.create Integer Stream.
		IntStream.range(1, 10).forEach(System.out::println);
		
		
		
		//2.Integer Steam with intermediate Skip
		IntStream.range(1, 10).skip(5).forEach( num -> System.out.print(num + " "));
		
		//4.Integer Sum 
		System.out.println("\n sum = "+
				IntStream.range(1, 10).sum()
		);
		
		//5. Stream.of , sorted, and findFirst.
		Stream<String> stream = Stream.of("B", "A", "D"); 
		stream.sorted().findFirst().ifPresent(System.out::println);
		
		// 6. Steam form array sort, filter and pring
		String[] names = {"Mani","Naveen","Govind" , "Ajay", "Goutham"};
		Arrays.stream(names)
			.filter(name -> name.startsWith("G"))
			.sorted()
			.forEach(System.out::println);
		
		//7. Average squares of an int array
		Arrays.stream(new int [] {3,2,4,6,7})
			.map(x->x*x)
			.average().ifPresent(System.out::println);
		
		
		//8. Steam from List, filter and pring
		List<String> peoples = 
			Arrays.asList("Mani","Naveen","Govind" , "Ajay", "Goutham");
		peoples.stream()
		.filter(p -> p.startsWith("g") || p.startsWith("G"))
		.map(String::toLowerCase)
		.forEach(System.out::println);
		
		
		//9. Steram rows from text file , sort , filter and pring
		try(Stream<String> users = Files.lines(Paths.get("streamExampleFile1.txt")) )
		{
			System.out.println("9. Sorted Names : \n Steram rows from text file , sort , filter and pring");
			users.sorted().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("10.Steram rows from CSV file and count");
		try(Stream<String> rows = Files.lines(Paths.get("streamExampleFile_2.csv")) ){
			Integer rowCount = (int) rows.
					map(r -> r.split(","))
					.filter(r->r.length==5)
					.count();
			System.out.println("row count :" + rowCount);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("11.Steram rows from and parse data");
		try(Stream<String> rows = Files.lines(Paths.get("streamExampleFile_2.csv")) ){
			 rows.
					map(r -> r.split(","))
					.filter(r->r.length==5)
					.filter(r->Integer.parseInt(r[3])>28)
					.forEach(r-> System.out.println(r[0]+ " " + r[1]  + " "+ r[2] +" "+r[3] ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("13.Steram rows. and store in hashMap	");
		try(Stream<String> rows = Files.lines(Paths.get("streamExampleFile_2.csv")) ){
			
			Map<String, String> data =
					rows.
					map(r -> r.split(","))
					.filter(r->r.length==5)
					//.filter(r->Integer.parseInt(r[3])>28)
					.collect(Collectors.toMap(r-> r[0], r-> r[1]));
					
			data.entrySet().stream().forEach(System.out::println);
			
					
					//.forEach(r-> System.out.println(r[0]+ " " + r[1]  + " "+ r[2] +" "+r[3] ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("14.Steram Reduction - sum");
//		Number total  = Stream.of(1.1,2,3).reduce(0, 
//				(Number a, Number b) -> a+b);

		double sum = IntStream.range(1, 5).reduce(0, 
                (element1, element2) -> element1 + element2); 
		System.out.println("sum :"+ sum);
		
		
		
		System.out.println("15.Steram Reduction - summary");
//		Number total  = Stream.of(1.1,2,3).reduce(0, 
//				(Number a, Number b) -> a+b);

		IntSummaryStatistics summary = IntStream.range(1, 5).summaryStatistics(); 
		System.out.println(summary);
		
	}

}
