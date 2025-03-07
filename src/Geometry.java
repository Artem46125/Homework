public interface Geometry {
    String colorZalivka = "Красный";
    String colorBorder = "Черный";
    double calculatePerimetr();
    double calculateArea();
}
class Circle implements Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: Perimetr: " + calculatePerimetr() + ", Area: " + calculateArea() + ", Color background: " + colorZalivka + ", Color border: " + colorBorder;
    }
}
    class Rectangle implements Geometry {
        private double width;
        private double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public double calculatePerimetr() {
            return (width + height) * 2;
        }
        @Override
        public double calculateArea() {
            return width * height;
        }
        @Override
        public String toString() {
            return "Circle: Perimetr: " + calculatePerimetr() + ", Area: " + calculateArea() + ", Color background: " + colorZalivka + ", Color border: " + colorBorder;
    }
}
    class Triangle implements Geometry {
        private double a;
        private double b;
        private double c;
        private double p;

        public Triangle(double a, double b, double c, double p) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double calculatePerimetr() {
            return a + b + c;
        }

        @Override
        public double calculateArea() {
            double p = calculatePerimetr() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        @Override
        public String toString() {
            return "Circle: Perimetr: " + calculatePerimetr() + ", Area: " + calculateArea() + ", Color background: " + colorZalivka + ", Color border: " + colorBorder;
        }
    }
    class Mains {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, 5, 6);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
    }

