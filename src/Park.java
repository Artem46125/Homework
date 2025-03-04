public class Park {
    public static class Attractions {
        private String name;
        private String time;
        private double price;

        public Attractions(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public String getTime() {
            return time;
        }
        public double getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attractions Attraction1 = new Attractions("Белорусские горки", "17.00-20.00", 5);
        System.out.println("Аттракцион:" + Attraction1.getName());
        System.out.println("Время работы:" + Attraction1.getTime());
        System.out.println("Стоимость:" + Attraction1.getPrice());
    }
}

