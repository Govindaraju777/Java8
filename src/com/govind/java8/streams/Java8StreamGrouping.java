package com.govind.java8.streams;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.govind.java8.streams.Person.Gender;
 
public class Java8StreamGrouping {
 
    private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
 
    public static void main(String[] args) {
 
        try {
 
            List <Person> persons = new ArrayList <Person> ();
            persons.add(new Person(1, "Yashwant", dateFormat.parse("11/02/1982"), "M"));
            persons.add(new Person(2, "Mahesh", dateFormat.parse("01/08/1981"), "M"));
            persons.add(new Person(3, "Vinay", dateFormat.parse("01/08/1981"), "M"));
            persons.add(new Person(4, "Dinesh", dateFormat.parse("01/08/1981"), "M"));
            persons.add(new Person(5, "Kapil", dateFormat.parse("01/02/1989"), "M"));
            persons.add(new Person(6, "Ganesh", dateFormat.parse("11/02/1982"), "M"));
            persons.add(new Person(7, "Nita", dateFormat.parse("01/08/1981"), "F"));
            persons.add(new Person(8, "Pallavi", dateFormat.parse("04/25/1987"), "F"));
            persons.add(new Person(9, "Mayuri", dateFormat.parse("01/08/1981"), "F"));
            persons.add(new Person(10, "Divya", dateFormat.parse("01/08/1981"), "F"));
 
            Map <String, Long> byGender = persons.stream()
                .collect(Collectors.groupingBy(p -> p.getGender(), Collectors.counting()));
 
            Map <Object, Long> byBirthDate = persons.stream()
                .collect(Collectors.groupingBy(p -> dateFormat.format(p.getBirthDate()), Collectors.counting()));
 
            Map <String, Map <Object, String>> byGenderAndBirthDate = persons.stream()
                .collect(Collectors.groupingBy(p -> p.getGender(),
                    Collectors.groupingBy(p -> dateFormat.format(p.getBirthDate()),
                        Collectors.mapping(p -> p.getName(), Collectors.joining(", ")))));
 
            System.out.println("Group By Gender");
            System.out.println(byGender);
            System.out.println("\nGroup By BirthDate");
            System.out.println(byBirthDate);
            System.out.println("\nGroup By Gender & BirthDate");
            System.out.println(byGenderAndBirthDate);
 
        } catch (ParseException e) {
            e.printStackTrace();
        }
 
    }
}

