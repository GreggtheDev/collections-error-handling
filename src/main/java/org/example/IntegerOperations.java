package org.example;

import java.util.*;

public class IntegerOperations {
    public static void main(String[] args) {
        // Define a List of integers with at least one set of duplicates
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 9, 10, 5);

        // Use a Set to remove duplicates
        Set<Integer> integerSet = new HashSet<>(integerList);

        // Calculate the sum and average of the integers
        int sum = 0;
        double average = 0.0;
        try {
            for (int num : integerSet) {
                sum += num;
            }
            if (integerSet.size() == 0) {
                throw new ArithmeticException("Division by zero");
            }
            average = (double) sum / integerSet.size();
        } catch (ArithmeticException e) {
            System.out.println("Error calculating average: " + e.getMessage());
        }

        // Print the sum, average, and the list of integers without duplicates
        System.out.println("List of integers without duplicates: " + integerSet);
        System.out.println("Sum of integers: " + sum);
        System.out.println("Average of integers: " + average);