public class Product {
    private String name;
    private String dataOfProduct;
    private int price;
    private String country;
    private String bookingStatus;

    public Product(String name, String dataOfProduct, int price, String country, String bookingStatus) {
        this.name = name;
        this.dataOfProduct = dataOfProduct;
        this.price = price;
        this.country = country;
        this.bookingStatus = bookingStatus;
    }

    public void Information() {
        System.out.println("Название: " + name);
        System.out.println("Дата: " + dataOfProduct);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Бронирование: " + bookingStatus);
    }

    public static void main(String[] args) {
        System.out.println("Задание 1.");
        Product product = new Product("Телефон", "2020", 2000, "Беларусь", "Забронирован");
        product.Information();
        product.Market();
    }
    public void Market() {
        System.out.println("Задание 2.");
        Product[] products = new Product[5];
        products[0] = new Product("Самсунг", "2021", 1750, "Япония", "Забронирован");
        products[1] = new Product("Айфон", "2024", 4800, "США", "Не забронирован");
        products[2] = new Product("Нокиа", "1999", 500, "Великобритания", "Забронирован");
        products[3] = new Product("Сяоми", "2025", 2750, "Китай", "Забронирован");
        products[4] = new Product("Хуавей", "2024", 2750, "Китай", "Не забронирован");
        for (Product p : products) {
            System.out.println("Название: " + p.name + ", Дата: " + p.dataOfProduct + ", Страна: " + p.country + ", Цена: " + p.price + ", Бронирование: " + p.bookingStatus);
        }
    }
}
