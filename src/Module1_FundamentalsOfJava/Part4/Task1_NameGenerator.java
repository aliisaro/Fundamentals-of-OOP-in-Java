package Module1_FundamentalsOfJava.Part4;

import java.util.Scanner;
import java.util.Random;

public class Task1_NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {"Matti", "Pekka", "Katti"};
        String[] lastNames = {"Meikäläinen", "Pouta", "Matikainen"};

        System.out.print("How many random names do you want to create? ");
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < amount; i++) {
            Random rand = new Random();
            int int1 = rand.nextInt(3);
            int int2 = rand.nextInt(3);

            System.out.println(firstNames[int1] + " " + lastNames[int2]);
        }
    }
}
