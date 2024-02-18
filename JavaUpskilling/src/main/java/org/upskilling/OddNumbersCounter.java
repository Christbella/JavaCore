package org.upskilling;

public class OddNumbersCounter {

    // Method to count odd numbers in the array
    public static int countOddNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            // Check if the number is odd
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Count odd numbers
        int count = countOddNumbers(numbers);

        // Check if count is greater than 0, else print 'NONE FOUND'
        if (count > 0) {
            System.out.println("Number of odd numbers: " + count);
        } else {
            System.out.println("NONE FOUND");
        }
    }
}



//Write a function that accepts an array as a parameter and counts
//the number of odd numbers in the array. if there is no prime number,
//print out the word 'NON FOUND'
