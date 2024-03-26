package Module1.Part1;

import java.util.Scanner;
import static java.lang.Math.round;

public class Task3_SumProductAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number:");
        double first = Double.parseDouble(scanner.nextLine());

        System.out.print("Give the second number:");
        double second = Double.parseDouble(scanner.nextLine());

        System.out.print("Give the third number:");
        double third = Double.parseDouble(scanner.nextLine());

        System.out.println("The sum of the numbers is " + round(first + second + third));
        //Sum of the numbers should be calculated inside brackets before dividing with 3 to get the average.
        //otherwise it will calculate the divison first.
        System.out.println("The average of the numbers is " + ((first + second + third) / 3));
        System.out.println("The product of the numbers is " + round(first * second * third));
    }
}
