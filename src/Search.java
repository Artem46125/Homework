public class Search {
    public static void main(String[] args) {
        String[] array = {"0", "1", "2", "3", "4", "5"};
        System.out.println("Задание 4");
        try {
            System.out.println("Элемент массива с индексом 10: " + array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
