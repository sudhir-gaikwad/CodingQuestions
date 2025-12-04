package org.example;

public class Factorial {

    public static void main(String[] args)  {
        factorial(12);
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
