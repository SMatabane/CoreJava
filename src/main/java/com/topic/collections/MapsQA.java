package com.topic.collections;

import java.util.HashMap;

public class MapsQA {

    public static void main(String[] args) {

        craeteMaps();
    }


    //1.Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void craeteMaps(){

        HashMap<String,Integer> map=new HashMap<>();
        map.put("www.example.com",12333);
        map.put("www.example2.com",12332);
        map.put("www.example3.com",12334);


        map.forEach((k,v)-> System.out.println( k + " : " + v)); //print out the entries

        System.out.println(" Size " +map.size()); //get the size of the entries.

    }

    //2.Write a Java program to copy all mappings from the specified map to another map.
    public void copyMap(){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("www.example.com",12333);
        map.put("www.example2.com",12332);
        map.put("www.example3.com",12334);

        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("www.example.com",12333);
        map1.put("www.example2.com",12332);
        map1.put("www.example3.com",12334);

        map1.putAll(map);

        System.out.println("New entries : " + map1) ;

    }

    //3.Write a Java program to test if a map contains a mapping for the specified key.
    public static void containsKeyValue(String key,int value){

        HashMap<String,Integer> map=new HashMap<>();
        map.put("www.example.com",12333);
        map.put("www.example2.com",12332);
        map.put("www.example3.com",12334);

        System.out.println(map.containsKey(key) +"\n"+ map.containsValue(value));

        

    }





}
