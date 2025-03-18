package org.example;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Первое число больше второго.");
        } else if (number1 < number2) {
            System.out.println("Первое число меньше второго.");
        } else {
            System.out.println("Оба числа равны.");
        }

        scanner.close();
    }
}
