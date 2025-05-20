package com.topic.exceptionHandling.exceptionclasses;

import com.topic.exceptionHandling.exception.DuplicateValueException;

import java.util.*;
/*
        1. Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
 */
public class DuplicateException {



    public static void duplicates(){
        try {
            List<Integer> num=getIntegerListFromUser();
            checkDuplicates(num);
        } catch (DuplicateValueException e) {
            System.out.println("ERROR " +e.getMessage());
        }


    }


    /*
        get list of number
     */
    public static List<Integer> getIntegerListFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        scanner.close();
        return numbers;
    }
    /*
        get duplicate values from user
     */
    public static void checkDuplicates(List < Integer > numbers) throws DuplicateValueException {
        Set< Integer > uniqueNumbers = new HashSet< >();

        for (int num: numbers) {
            if (uniqueNumbers.contains(num)) {
                throw new DuplicateValueException("Duplicate number found: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
}

