import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        contacts.putIfAbsent(surname, new ArrayList<>());
        contacts.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return contacts.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "222-22-22");
        phoneBook.add("Иванов", "333-33-33");
        phoneBook.add("Сергеев", "444-44-44");

        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Петров"));
        System.out.println(phoneBook.get("Сидоров"));
    }
}
