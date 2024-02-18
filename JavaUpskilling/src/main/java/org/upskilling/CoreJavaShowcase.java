package org.upskilling;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoreJavaShowcase {
        // Constants for the temperature example
        private static final int HOT_DAY_THRESHOLD = 30;
        private static final int NICE_DAY_LOWER_BOUND = 20;
        private static final int HIGH_INCOME_THRESHOLD = 100_000;

        // Enum for user roles
        enum UserRole {
            ADMIN, MODERATOR, GUEST
        }

        // Inner class for User, moved inside CombinedExamples
        static class User {
            String name;
            UserRole role;

            public User(String name, UserRole role) {
                this.name = name;
                this.role = role;
            }

            public String getName() {
                return name;
            }

            public UserRole getRole() {
                return role;
            }
        }

        public static void main(String[] args) {
            gradeAndFeedback(95);
            printAdmins();
            printTemperatureFeedback(32);
            printClassBasedOnIncome(120_000);
        }

        // Method combining grading and feedback logic
        private static void gradeAndFeedback(int marks) {
            // Using If-Else for grading
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 80) {
                System.out.println("Grade B");
            } else if (marks >= 70) {
                System.out.println("Grade C");
            } else if (marks >= 60) {
                System.out.println("Grade D");
            } else {
                System.out.println("Grade F");
            }

            // Simplifying with Ternary Operator for performance
            String performance = (marks >= 75) ? "Good" : "Average";
            System.out.println("Your performance is " + performance);

            // Using Switch Statement for additional feedback
            int scoreCategory = marks / 10;
            switch (scoreCategory) {
                case 10:
                case 9:
                    System.out.println("Excellent");
                    break;
                case 8:
                    System.out.println("Very Good");
                    break;
                case 7:
                    System.out.println("Good");
                    break;
                default:
                    System.out.println("Needs Improvement");
                    break;
            }
        }

        // Method to print admins using Stream API
        private static void printAdmins() {
            List<User> users = Arrays.asList(
                    new User("Alice", UserRole.ADMIN),
                    new User("Bob", UserRole.MODERATOR),
                    new User("Charlie", UserRole.GUEST),
                    new User("Dana", UserRole.ADMIN)
            );

            List<User> admins = users.stream()
                    .filter(user -> user.getRole() == UserRole.ADMIN)
                    .collect(Collectors.toList());

            System.out.println("Admins: " + admins.stream().map(User::getName).collect(Collectors.joining(", ")));
        }

        // Temperature feedback method
        private static void printTemperatureFeedback(int temperature) {
            if (temperature > HOT_DAY_THRESHOLD) {
                System.out.println("It's a hot day. Drink plenty of water.");
            } else if (temperature >= NICE_DAY_LOWER_BOUND) {
                System.out.println("It's a beautiful day.");
            } else {
                System.out.println("It's cold. Dress warmly.");
            }
        }

        // Class based on income method
        private static void printClassBasedOnIncome(int income) {
            String className = income > HIGH_INCOME_THRESHOLD ? "First" : "Economy";
            System.out.println("Travel class: " + className);
        }
    }


