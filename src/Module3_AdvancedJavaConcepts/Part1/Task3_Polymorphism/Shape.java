package Module3_AdvancedJavaConcepts.Part1.Task3_Polymorphism;


public abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Area of Circle with radius %.1f: %.14f", radius, calculateArea());
    }
}

class Rectangle extends Shape {
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
    public String toString() {
        return String.format("Area of Rectangle with width %.1f and height %.1f: %.1f", width, height, calculateArea());
    }
}

class Triangle extends Shape {
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
    public String toString() {
        return String.format("Area of Triangle with base %.1f and height %.1f: %.1f", base, height, calculateArea());
    }
}
