package org.upskilling;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String... args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            while (scanner.hasNextInt()) {
                int year = scanner.nextInt();

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is a Common Year, not a Leap Year.");
                }

            }
        }
    }
}

