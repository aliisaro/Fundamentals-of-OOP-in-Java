package Module3_AdvancedJavaConcepts.Part1.Task4_ShapeProperties;
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Shape.Circle(5.0, "RED");
        shapes[1] = new Shape.Rectangle(6.0, 4.0, "BLUE");
        shapes[2] = new Shape.Triangle(8.0, 3.0, "YELLOW");

        for (Shape shape : shapes) {
            System.out.println(shape.printColor() + shape.print());
        }
    }
}
