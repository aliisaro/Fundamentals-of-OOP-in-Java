package Module1.Part2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task2_Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give side 1 of triangle:");
        double side1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Give side 2 of triangle");
        double side2 = Double.parseDouble(scanner.nextLine());

        //hypotenuusa pyöristettynä 2 desimaalin tarkkuudella
        double hypotenuse = round(sqrt(pow(side1, 2) + pow(side2,2)) * 100.0) / 100.0;

        System.out.println(hypotenuse);
    }
}
