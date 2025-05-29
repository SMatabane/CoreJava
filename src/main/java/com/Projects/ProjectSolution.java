package com.Projects;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ProjectSolution {

    static Scanner scanner = new Scanner(System.in);
    Random ranNumber = new Random();


    public static void main(String[] args) {

    }

    /**
     * 1.: User guesses a randomly generated number within a range.
     */
    public void numbergenerator() {
        int rand = ranNumber.nextInt(100); // random number between 0–99

        String continueGame;

        do {
            try {
                System.out.println("Enter a number between 0 and 99:");
                int input = scanner.nextInt();

                if (input > rand) {
                    System.out.println("Too high, try again.");
                } else if (input < rand) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println(" You win!");
                }

                System.out.print("Do you want to continue? (yes/no): ");
                scanner.nextLine(); // Consume leftover newline
                continueGame = scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println(" Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continueGame = "yes"; // Keep game running
            } catch (Exception e) {
                System.out.println(" Unexpected error: " + e.getMessage());
                continueGame = "no"; // Stop game on unexpected error
            }

        } while (continueGame.equalsIgnoreCase("yes"));

        System.out.println("Program terminated. Goodbye!");
        scanner.close();

    }

    /**
     * 2. Check whether a given word or phrase is a palindrome.
     */
    public void palindromeChecker() {

        try {
            String input = scanner.nextLine();

            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equals(reversed)) {
                System.out.println("Word is Palindrome");
            } else {
                System.out.println("Word is not Palindrome");
            }
        } catch (InputMismatchException e) {
            System.out.println(" Invalid input. Please enter a String.");


        }finally{
            scanner.close();
        }

    }
    /**
     * 3. Check whether a given word or phrase is a palindrome.
     */



}
