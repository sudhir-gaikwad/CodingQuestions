package org.example;

public class DigitCounterD {
    public static void main(String[] args) {
        long number = 134564;
        int digit = 4;

        int count = 0;
        long temp = Math.abs(number); // handle negative numbers

        while (temp > 0) {
            long lastDigit = temp % 10;
            if (lastDigit == digit) {
                count++;
            }
            temp /= 10;
        }

        System.out.println("Digit " + digit + " appears " + count + " times in " + number);
    }
}
