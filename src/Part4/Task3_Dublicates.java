package Part4;

import java.util.Scanner;

public class Task3_Dublicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Array to keep track of seen elements
        boolean[] seen = new boolean[101]; //assuming input integers are between 0 and 100

        // Array to store unique elements
        int[] updatedNumbers = new int[size];
        int uniqueCount = 0;

        System.out.println("\nThe array without duplicates:");
        for (int i = 0; i < size; i++) {
            if (!seen[numbers[i]]) {
                seen[numbers[i]] = true;
                System.out.print((updatedNumbers[uniqueCount++] = numbers[i]) + " ");
            }
        }
    }
}
