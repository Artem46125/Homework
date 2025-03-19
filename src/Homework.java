public class Homework {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(numberFive(5, 7));
        numberSix(6);
        System.out.println(numberSeven(7));
        numberEight("Vodka", 3);
        System.out.println(numberNine(2017));
        numberTen();
        numberEleven();
        numberTwelve();
        numberThirteen();
        numberFourteen(2, 5);
    }

        public static void printThreeWords() {
        System.out.println("Задание 1.");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.println("Задание 2.");
        int a = 5;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println("Задание 3.");
        int value = -5;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("Задание 4.");
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean numberFive(int a, int b) {
        System.out.println("Задание 5.");
        int c = a+b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberSix(int a) {
        System.out.println("Задание 6.");
        if (a >= 0) {
            System.out.println(a + " - Положительное число");
        } else {
            System.out.println(a + " - Отрицательное число");
        }
    }

    public static boolean numberSeven(int a) {
        System.out.println("Задание 7.");
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberEight(String str, int a) {
        System.out.println("Задание 8.");
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean numberNine(int year) {
        System.out.println("Задание 9.");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberTen() {
        System.out.println("Задание 10.");
        int [] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
            System.out.print("После замены: ");
            for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void numberEleven() {
        System.out.println("Задание 11.");
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
            System.out.println(arr[i] + " ");
        }
    }

    public static void numberTwelve() {
        System.out.println("Задание 12.");
        int [] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.println(arr[i] + " ");
        }
    }

    public static void numberThirteen() {
        System.out.println("Задание 13.");
        int [][] table = new int [10][10];
        for (int i = 0; i < 10; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
            }
    }

    public static void numberFourteen(int len, int initialValue) {
        System.out.println("Задание 14.");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}