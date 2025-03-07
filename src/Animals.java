public class Animals {
    static int counterAnimals = 0;

    Animals() {
        counterAnimals++;
    }

    public void run(int distance) {
        System.out.println("Animal run " + distance + " m.");
    }

    public void swim(int distance) {
        System.out.println("Animal swim " + distance + " m.");
    }

    public static int getCounterAnimals() {
        return counterAnimals;
    }
}
    class Dog extends Animals {
        String name;
        static int counterDog = 0;

        Dog(String name) {
            super();
            counterDog++;
            this.name = name;
        }

        @Override
        public void run(int distance) {
            if (distance > 500) {
                System.out.println(name + " Не может пробежать больше 500 м.");
            } else {
                System.out.println(name + " Пробежал " + distance + " м.");
            }
        }

        @Override
        public void swim(int distance) {
            if (distance > 10) {
                System.out.println(name + " Не может проплыть больше 10 м.");
            } else {
                System.out.println(name + " Проплыл " + distance + " м.");
            }
        }

        static int getCounterDog() {
            return counterDog;
        }
    }
class Cat extends Animals {
    String name;
    boolean isHungry;
    static int counterCat = 0;

    Cat(String name) {
        super();
        counterCat++;
        this.name = name;
        this.isHungry = false;
    }
    public void eat(int food, Plate plate) {
        if (plate.getFoodAmount() >= food) {
            plate.decreaseFood(food);
            isHungry = true;
            System.out.println(name + " поел " + food + " еды.");
        } else {
            System.out.println(name + " недостаточно еды в тарелке, чтобы поесть.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " не может пробежать больше 200 м.");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    static int getCounterCat() {
        return counterCat;
    }

    public boolean isHungry() {
        return isHungry;
    }
}

class Plate {
    private int foodAmount;

    Plate(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = initialFood;
        }
    }

    public void decreaseFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println(amount + " еды добавлено в тарелку.");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Animals animals1 = new Animals();
        Animals animals2 = new Animals();
        Animals animals3 = new Animals();
        Cat touzik = new Cat("Touzik");
        Cat massik = new Cat("Massik");
        Cat kumar = new Cat("Kumar");
        Dog berta = new Dog("Berta");
        Dog alex = new Dog("Alex");
        Dog alexi = new Dog("Alexi");
        System.out.println("Задание 1.");

        System.out.println("Всего животных:" + Animals.getCounterAnimals());
        System.out.println("Всего собак:" + Dog.getCounterDog());
        System.out.println("Всего котов:" + Cat.getCounterCat());
        touzik.run(150);
        massik.swim(5);
        kumar.run(250);
        berta.run(400);
        alex.swim(8);
        alexi.swim(12);
        System.out.println("Задание 1.2");

        Plate plate = new Plate(30);
        Cat[] cats = {touzik, massik, kumar};
        for (Cat cat : cats) {
            cat.eat(10, plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isHungry());
        }

        plate.addFood(20);
        System.out.println("Количество еды в тарелке: " + plate.getFoodAmount());

        for (Cat cat : cats) {
            cat.eat(15, plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isHungry());
        }
    }
}
