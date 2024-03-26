package Module1.Part3;

import java.util.Scanner;
import java.util.Random;

public class Task4_MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        while (score < 10) {
            Random rand = new Random();

            int int1 = rand.nextInt(10) + 1;
            int int2 = rand.nextInt(10) + 1;

            System.out.println("What is: " + int1 + " * " + int2 + " ? ");
            int answer = Integer.parseInt(scanner.nextLine());

            if (answer == int1 * int2) {
                System.out.println("Correct! You earn one point.");
                score++;
            } else {
                System.out.println("False. The exam will start again.");
                score = 0;
            }
        }
        System.out.println("Congratulations for mastering the multiplication table! \nYou answered correctly 10 times in a row.");
    }
}
