package Module1.Part3;

import java.util.Scanner;
public class Task3_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a bigger positive integer: ");
        int end = Integer.parseInt(scanner.nextLine());

        boolean flag;

        while (start <= end) {
            flag = false;
            if (start > 1) {
                for (int i = 2; i < start; i++) {
                    if (start % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag == true) {
                    System.out.println(start + " is not a prime number");
                } else {
                    System.out.println(start + " is a prime number");
                }
            } else {
                System.out.println(start + " is not a prime number");
            }
            start++;
        }
    }
}
