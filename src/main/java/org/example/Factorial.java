package org.example;

public class Factorial {
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
