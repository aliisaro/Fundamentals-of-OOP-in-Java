package Module3_AdvancedJavaConcepts.Part1.Task4_ShapeProperties;
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0, "Red");
        shapes[1] = new Rectangle(6.0, 4.0, "Blue");
        shapes[2] = new Triangle(8.0, 3.0, "Green");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
