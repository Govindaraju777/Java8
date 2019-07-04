package com.govind.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExampleGroupBy {

	public static void main(String[] args) {
		List<TradeInput> tradeList = Arrays.asList(
				new TradeInput("Bangalore", "India", "M", 20000.0), 
				new TradeInput("Bangalore", "India", "M", 30000.0),
				new TradeInput("Bangalore", "India", "F", 30000.0),
				new TradeInput("Chennai", "India", "M", 30000.0),
				new TradeInput("Chennai", "India", "M", 20000.0),
				new TradeInput("Chennai", "India", "F", 30000.0),
				new TradeInput("Chennai", "India", "F", 30000.0)

		);
		System.out.println("\n\n"+tradeList + "\n\n");

		
		System.out.println(" \n Start :------------- Group by getCity -------------\n ");
		Map<String, List<TradeInput>> groupByCity = 
		tradeList.stream().collect( Collectors.groupingBy(TradeInput::getCity) );
		System.out.println(groupByCity);
		System.out.println(" End :------------- Group by getCity -------------\n ");

		
		
		System.out.println(" \n Start :------------- Group by getCity syntax-2-------------\n ");
		Map<String, List<TradeInput>> groupByCity_B = 
		tradeList.stream().collect( Collectors.groupingBy( t-> t.getCity() ) );
		System.out.println(groupByCity_B);
		System.out.println(" End :------------- Group by getCity -------------syntax-2 \n ");

		
		System.out.println(" \n Start :------------- Group by City , Salary ------------- ");
		Map<String, Set<Double> > groupByCity1 = 
				tradeList.stream().collect( Collectors.groupingBy(TradeInput::getCity,
							Collectors.mapping(TradeInput::getSalary, Collectors.toSet())
		) );
		System.out.println(groupByCity1);
		System.out.println(" End :------------- Group by City , Salary -------------\n ");
		
		
//		System.out.println(" \n Start :------------- Group by City , Salary syntax-------------- ");
//		Map<String, Set<Double> > groupByCity1_B = 
//				tradeList.stream().collect( Collectors.groupingBy(t->t.getCity(),
//							Collectors.mapping(TradeInput::getSalary, Collectors.toSet())
//		) );
//		System.out.println(groupByCity1_B);
//		System.out.println(" End :------------- Group by City , Salary -------------syntax-\n ");
//		
		
		
		System.out.println(" \n Start :------------- Group by City , Salary and Calculate Average------------- ");
		Map<String, Double> groupByCity2 = 
				tradeList.stream().
							collect( Collectors.groupingBy(TradeInput::getCity,Collectors.averagingDouble(TradeInput::getSalary))
		);
		System.out.println(groupByCity2);
		System.out.println(" \n End :------------- Group by City , Salary and Calculate Average------------- ");
		
		
		
		
		
		//group by multiple properties
		System.out.println(" \n Start :------------- List Group by - by City , gender and Calculate Average of Salary------------- ");
		Map<String, Map<String,Double> > groupByCity3 = 
				tradeList.stream().
							collect( 
									Collectors.groupingBy(TradeInput::getCity, Collectors.groupingBy(TradeInput::getGender,Collectors.averagingDouble(TradeInput::getSalary)) )
							);
		
		System.out.println(groupByCity3);
		System.out.println(" \n End :------------- List Group by - by City , gender and Calculate Average of Salary------------- ");

		
//		System.out.println("----------------------------------");
//		Map<Object, Map<Object, List<TradeInput>>> byGenderAndBirthDate = tradeList.stream()
//				.collect(Collectors.groupingBy(p-> p.getCity(),Collectors.groupingBy(p-> p.getCounry())));
//		
//		System.out.println(byGenderAndBirthDate);
		
		
		System.out.println(" \n Start :------------- List Group by - by City , gender and Calculate Average of Salary syntax-2------------- ");
		Map<String, Map<String, Double>> byGenderAndBirthDate = tradeList.stream()
				.collect(Collectors.groupingBy(p-> p.getCity(),Collectors.groupingBy(p-> p.getGender(),Collectors.averagingDouble(p->p.getSalary()))));
		System.out.println(byGenderAndBirthDate);
		System.out.println(" \n End :------------- List Group by - by City , gender and Calculate Average of Salary syntax-2------------- ");

		
		
//		
	}
	
}
