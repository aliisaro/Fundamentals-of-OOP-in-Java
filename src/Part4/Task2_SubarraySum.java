package Part4;

import java.util.Scanner;

public class Task2_SubarraySum {
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

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for (int start = 0; start < size; start++) {
            int sum = 0;
            for (int end = start; end < size; end++) {
                sum += numbers[end];

                if (sum > maxSum) {
                    maxSum = sum;
                    startIndex = start;
                    endIndex = end;
                }
            }
        }
        System.out.println("\nMaximum sum: " + maxSum);
        System.out.print("Integers: " + (startIndex+1) + "-" + (endIndex+1));
    }
}
