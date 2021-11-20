package com.company.collectionSolutions;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortedArray {
    public static void main(String[] args) {
        try {
            Integer[] sortedValues = sortArray(null);
            System.out.println(Arrays.toString(sortedValues));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Integer[] sortArray(int[] numbers) throws IllegalArgumentException {
        // if the numbers array is empty or null we throw an
        // exception.
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("No empty arrays allowed");
        }

        // Create a tree set to organize the data.
        // and transform it back into an array.
        Set<Integer> integerSet = new TreeSet<>();

        for (int number : numbers) {
            integerSet.add(number);
        }

        // whenever you use collections, anything added to the collection,
        // becomes an object regardless of if it was a primitive data type
        // before being added. boolean -> Boolean.
        return integerSet.toArray(new Integer[]{});
    }
}
