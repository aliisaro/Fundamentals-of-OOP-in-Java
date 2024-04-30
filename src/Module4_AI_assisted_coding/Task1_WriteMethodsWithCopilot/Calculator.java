package Module4_AI_assisted_coding.Task1_WriteMethodsWithCopilot;

import java.util.Random;

public class Calculator {
    private int value;

    public void resetCalculator() {
        value = 0;
        System.out.println("Calculator reset. ");
    }

    public void add() {
        value += 1;
        System.out.println("Number 1 added to calculator. ");
    }

    public int getValue() {
        return value;
    }

    public void sum(int a, int b) {
        value += a + b;
        System.out.println("Sum of " + a + " and " + b + " added to calculator.");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add();
        calculator.resetCalculator();
        System.out.println("Value of calculator: " + calculator.getValue());

        // Creating a loop to count sums of random numbers
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            calculator.sum(a, b);
        }

        System.out.println("Value of calculator: " + calculator.getValue());

    }
}