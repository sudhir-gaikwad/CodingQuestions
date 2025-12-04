package org.example.array;

public class TwoSumFinder {

    public static void findTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Numbers: " + arr[i] + ", " + arr[j]);
                    System.out.println("Indices: " + i + ", " + j);
                    return; // Stop after finding first pair
                }
            }
        }
        System.out.println("No pair found!");
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 23, 5, 6};
        int target = 38;

        findTwoSum(arr, target);
    }
}
