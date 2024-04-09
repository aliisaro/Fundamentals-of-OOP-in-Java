package Module3_AdvancedJavaConcepts.Part1.Task4_ShapeProperties;

public abstract class Shape {
    protected String color; // Common property

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Area of Circle with radius %.1f and color %s: %.14f", radius, color, calculateArea());
    }
}

class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return String.format("Area of Rectangle with width %.1f, height %.1f, and color %s: %.1f", width, height, color, calculateArea());
    }
}

class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * base;
    }

    @Override
    public String toString() {
        return String.format("Area of Triangle with base %.1f, height %.1f, and color %s: %.1f", base, height, color, calculateArea());
    }
}



