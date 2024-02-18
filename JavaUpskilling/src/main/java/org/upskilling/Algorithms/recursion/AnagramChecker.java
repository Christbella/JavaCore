package org.upskilling;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String... args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter second string: ");
            String str2 = scanner.nextLine();

            if (isAnagram(str1, str2)) {
                System.out.println("'" + str1 + "' and '" + str2 + "' are Anagrams.");
            } else {
                System.out.println("'" + str1 + "' and '" + str2 + "' are not Anagrams.");
            }
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
