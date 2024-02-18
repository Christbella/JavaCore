package org.upskilling;

import java.util.Scanner;
public class FibonacciSequenceGenerator {
    public static void main(String... args) {
        System.out.println("Fibonacci Sequence Generator");
        System.out.println("Choose method: 1 for Simple, 2 for Advanced");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();

            System.out.print("Enter the number of Fibonacci elements to generate: ");
            int count = scanner.nextInt();

            switch (choice) {
                case 1:
                    generateFibonacciSimple(count);
                    break;
                case 2:
                    generateFibonacciAdvanced(count);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting.");
                    break;
            }
        }
    }

    private static void generateFibonacciSimple(int count) {
        long prev = 0, next = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(prev + " ");
            long sum = prev + next;
            prev = next;
            next = sum;
        }
        System.out.println("\nExited Simple Fibonacci Sequence Generator.");
    }

    private static void generateFibonacciAdvanced(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\nExited Advanced Fibonacci Sequence Generator.");
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0, next = 1;
        for (int i = 2; i <= n; i++) {
            long sum = prev + next;
            prev = next;
            next = sum;
        }
        return next;
    }
}
//Simple Method

//Direct Iteration: This method directly prints each Fibonacci number
// as it iterates through the sequence. It starts with the first two
// Fibonacci numbers, 0 and 1, and calculates subsequent numbers by adding
// the last two numbers in the sequence.

//No Method Call for Calculation: It does not rely on a separate method to calculate
// each Fibonacci number but instead calculates and prints the numbers within a single loop.



//Advanced Method

//Separate Calculation Method: This method uses a separate fibonacci(int n) method to calculate each
// Fibonacci number. This design separates the concerns of calculating and printing the sequence.

//Reuse and Efficiency: The fibonacci(int n) method is designed to be efficient for calculating any
// single Fibonacci number, making it reusable for other parts of the program or for calculating a
// specific Fibonacci number on demand.