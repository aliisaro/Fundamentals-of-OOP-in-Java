package Module1_FundamentalsOfJava.Part3;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task2_BinaryValues {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = reader.nextLine();

        int decimal = 0;
        int power = binary.length();

        for (int i = 0; i < binary.length(); i++) {
            power -= 1;
            double y = pow(2, power);
            int x = Character.getNumericValue(binary.charAt(i));
            decimal += (x * y);
        }
        System.out.println(decimal);
    }
}