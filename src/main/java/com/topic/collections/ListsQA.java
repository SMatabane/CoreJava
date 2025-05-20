package com.topic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListsQA {




    public static void main(String[] args) {
        searchElement("purple");
        sortList();
    }


    /**
     *ArrayList
     */
    //1.Write a Java program to create an array list, add some colors (strings) and print out the collection.
    public  void lists(){
        List<String> colors=new ArrayList<>();

        colors.add("red");
        colors.add("black");
        colors.add("green");
        colors.add("orange");
        colors.add("blue");
        colors.add("red");

        for(String c:colors){
            System.out.println("colors :" + c);
        }

    }

    //2.Write a Java program to insert an element into the array list at the first position.
    public  void lists(int i){
        List<String> colors=new ArrayList<>();

        colors.add(i,"purple");

        for(String c:colors){
            System.out.println("colors :" + c);
        }

    }

    //3. Write a Java program to search for an element in an array list.
    public static void searchElement(String name){
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("green");
        colors.add("orange");
        colors.add("blue");
        colors.add("red");

        List<String> results= Collections.singletonList(colors.contains(name) ? "element found" : "element not found");

        System.out.println(results);

    }

    //4.Write a Java program to sort a given array list.
    public static void sortList(){
       List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("green");
        colors.add("orange");
        colors.add("blue");


        List<String> results=colors.stream().sorted().collect(Collectors.toList());
        System.out.println(results);
    }






}
