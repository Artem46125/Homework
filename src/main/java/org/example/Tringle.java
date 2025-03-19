package org.example;

public class Tringle {
    public static double area (double a, double b) {
        return 0.5 * a * b;
    }

    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double area = area(a, b);
        System.out.println(area);
    }
}
