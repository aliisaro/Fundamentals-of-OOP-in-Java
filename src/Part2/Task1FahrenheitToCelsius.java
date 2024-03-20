package Part2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task1FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = Double.parseDouble(scanner.nextLine());

        double celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println("In Celsius: " + round(celsius));
    }
}
