package com.lambdaStreams;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      streams();

    }

    /*
        streams expressions
     */
    public static void streams (){
        /*
            1.Write a Java program to find the second smallest and largest elements in a list of integers using streams.
         */
        List<Integer> numbers=Arrays.asList(1, 8, 4, 9, 10, 3);
        OptionalInt minnumbers=numbers.stream().sorted().skip(1).mapToInt(Integer::intValue).min();
        OptionalInt maxnumbers= numbers.stream().sorted(Comparator.reverseOrder())
        .skip(1).mapToInt(Integer::intValue).max();
        /*
            2.Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
         */
        int sumEven= (numbers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum());
        OptionalInt sumOdd= OptionalInt.of(numbers.stream().filter(n->n%2 !=0).mapToInt(Integer::intValue).sum());
        /*
            3.Write a Java program to count the number of strings in a list that start with a specific letter using streams.
         */
        List<String> str=Arrays.asList("Hope","Faith","Healing","Awesome","Growth","Red","Apples");
        long filteredString=str.stream().filter(s-> s.startsWith("H")).count();
        /*
            4. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
         */
        List<String> ascString=str.stream().sorted().collect(Collectors.toList());
        List<String> decString=str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ascending order : " +ascString + "\ndescending order : " +decString);








    }

    /*
        Lambda expressions
     */
    public void lambdas(){

        /*
         1.Write a Java program to implement a lambda expression to convert an integer to
         their corresponding binary representation.
        */
        Function<Integer,String> convert= Integer::toBinaryString;
        System.out.println(convert.apply(4));
        /*
         2. Write a Java program to implement a lambda expression to check if a given string is empty.
         */
        Predicate<String> str= String::isEmpty;
        System.out.println(str.test(""));
        /*
         3. Write a Java program to implement a lambda expression to convert
         a list of strings to uppercase and lowercase.
         */
        List<String> names= Arrays.asList("Dudu","Hope","Post");
        names.forEach(name-> System.out.println("Name to upper :" + name.toUpperCase() +"\n Name to Lower " + name.toLowerCase()
        ));

    }
}
