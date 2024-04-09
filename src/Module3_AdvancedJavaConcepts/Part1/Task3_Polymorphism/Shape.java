package Module3_AdvancedJavaConcepts.Part1.Task3_Polymorphism;

public class Shape {
    public double calculateArea() {
        return 0.0;
    }

    public String printArea() {
        return("Area of shape: " + calculateArea());
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String printArea() {
            return ("Area of Circle with radius " + radius + ": " + calculateArea());
        }
    }

    static class Rectangle extends Shape {
        private double height;
        private double width;

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return height * width;
        }

        @Override
        public String printArea() {
            return("Area of Rectangle with width " + width + " and height " + height + ": " + calculateArea());
        }
    }

    static class Triangle extends Shape {
        private double height;
        private double base;

        public Triangle(double height, double base) {
            this.height = height;
            this.base = base;
        }

        @Override
        public double calculateArea() {
            return 0.5 * height * base;
        }

        @Override
        public String printArea() {
            return("Area of Triangle with base " + base + " and height " + height + ": " + calculateArea());
        }
    }
}
