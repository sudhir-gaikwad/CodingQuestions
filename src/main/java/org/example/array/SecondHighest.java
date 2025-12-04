package org.example.array;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {

    public static int getSecondLargestSort(int[] arr) {
        int n = arr.length;
        // Sort the array in non-decreasing order
        Arrays.sort(arr);

        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            // return the first element which is not equal to the
            // largest element
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        // If no second largest element was found, return -1
        return -1;
    }

    public static int findSecondHighestStreams(int[] arr) {
        Integer SecondHighestElement = Arrays.stream(arr)
                .boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        return SecondHighestElement;
    }

    public static int findSecondHighest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            // You might throw an IllegalArgumentException here or return a specific value
            return -1; // Or handle as per your application's requirements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // The old largest becomes the new second largest
                largest = arr[i];        // The current element is the new largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];  // The current element is greater than secondLargest but not largest
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 20, 8};
        int secondHighest = findSecondHighest(numbers);
        System.out.println("The second highest element is: " + secondHighest); // Output: 15

        int[] singleElementArray = {7};
        secondHighest = findSecondHighest(singleElementArray); // Output: Array must contain at least two elements.
        System.out.println("The second highest element is: " + secondHighest); // Output: -1
    }
}