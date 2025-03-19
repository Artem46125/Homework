package org.example;

public class Compare {

    public static void main(String[] args) {
        System.out.println(compareNumbers(5, 3));
        System.out.println(compareNumbers(2, 4));
        System.out.println(compareNumbers(7, 7));
    }

    public static String compareNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return "Первое число больше второго.";
        } else if (firstNumber < secondNumber) {
            return "Первое число меньше второго.";
        } else {
            return "Оба числа равны.";
        }
    }
}
