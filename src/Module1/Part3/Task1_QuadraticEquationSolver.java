package Module1.Part3;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task1_QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give coefficient a:");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Give coefficient b:");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Give constant c:");
        double c = Double.parseDouble(scanner.nextLine());

        //double x = (-b + sqrt((pow(b,2) - 4*a*c))) / 2*a;
        //double formula = a*pow(x,2) + b*x + c;

        double x = b * b - 4.0 * a * c;

        if (x > 0.0) {
            double root1 = (-b + pow(x, 0.5)) / (2.0 * a);
            double root2 = (-b - pow(x, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (x == 0.0) {
            double root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("No real roots");
        }
    }
}
