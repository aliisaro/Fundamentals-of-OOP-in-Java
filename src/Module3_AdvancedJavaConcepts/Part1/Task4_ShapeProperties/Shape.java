package Module3_AdvancedJavaConcepts.Part1.Task4_ShapeProperties;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return(color);
    }

    public String printColor() {
        color = getColor();
        switch (getColor()) {
            case "RED":
                return("\u001B[31m");
            case "BLUE":
                return("\u001B[34m");
            case "YELLOW":
                return("\u001B[33m");
        }
        return("\u001B[32m");
    }

    public double calculateArea() {
        return 0.0;
    }

    public String print() {
        return("Area of shape: " + calculateArea());
    }

    static class Circle extends Shape {
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
        public String print() {
            return ("Area of Circle with radius " + radius + ": " + calculateArea());
        }
    }

    static class Rectangle extends Shape {
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
        public String print() {
            return("Area of Rectangle with width " + width + " and height " + height + ": " + calculateArea());
        }
    }

    static class Triangle extends Shape {
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
        public String print() {
            return("Area of Triangle with base " + base + " and height " + height + ": " + calculateArea());
        }
    }
}



