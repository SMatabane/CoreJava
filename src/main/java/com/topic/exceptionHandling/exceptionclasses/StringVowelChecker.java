package com.topic.exceptionHandling.exceptionclasses;

import com.topic.exceptionHandling.exception.VowelException;

import java.util.Scanner;

/*
    Write a Java program to create a method that takes a string as input a
      and throws an exception if the string does not contain vowels.
 */
public class StringVowelChecker {

    public static void stringchecker(){

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Provide a string");
            String text = scanner.next();

            vowels(text);

        } catch (VowelException e) {
            System.out.println("ERROR : " +e.getMessage());
        }





    }

    /*
        check vowels
     */

    public static void vowels(String text){
        boolean availablevowels = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);
            if (vowels.contains(String.valueOf(chr))) {
                availablevowels=true;
                break;
            }

        }
        if(!availablevowels) {
            throw new VowelException("String does not contain vowels.");

        }


    }


    }



