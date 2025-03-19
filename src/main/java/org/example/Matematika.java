package org.example;

public class Matematika {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(mult(a, b));
        System.out.println(div(a, b));
        System.out.println(sub(a, b));
        System.out.println(sum(a, b));
    }
}
