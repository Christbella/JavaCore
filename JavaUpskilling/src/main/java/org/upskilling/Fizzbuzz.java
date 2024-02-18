package org.upskilling;

import java.util.Scanner;

public class Fizzbuzz {

    //To improve the provided FizzBuzzChallenge program in an advanced way,
    // we'll focus on applying the DRY principle effectively, enhancing readability,
    // and avoiding unnecessary repetition or overly complex nested structures.
    // The aim is to make the code cleaner and more efficient
    public static void main(String... args) {
        // Scanner enclosed in try-with-resources for automatic resource management
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            while(scanner.hasNextInt()) { // Allows processing multiple inputs
                int number = scanner.nextInt();

                // Prioritized condition checks
                if (number % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (number % 5 == 0) {
                    System.out.println("Fizz");
                } else if (number % 3 == 0) {
                    System.out.println("Buzz");
                } else {
                    // Unified output for numbers that do not match Fizz, Buzz, or FizzBuzz criteria
                    System.out.println("Neither Fizz, Buzz, nor FizzBuzz");
                }
            }
        }
    }
}

