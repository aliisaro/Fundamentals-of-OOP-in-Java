Java program:

Calculator class with methods to add 1 to the calculation, reset the calculation, 
calculate sum of random numbers and get the value of the calculation.

```java
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
```

Expanation of the code:

First we create a class called Calculator. This class has a private integer variable called value. 

The class has four methods: resetCalculator, add, getValue and sum. 

The resetCalculator method sets the value to 0 and prints a message. 
The add method increments the value by 1 and prints a message. The getValue method returns the value. 
The sum method takes two integers as arguments, adds them to the value and prints a message. 

The main method creates an instance of the Calculator class, calls the add method, 
calls the resetCalculator method, prints the value of the calculator, generates random numbers and calls the sum method with those numbers, 
and finally prints the value of the calculator. The output of the program will show the messages printed 
by the methods and the final value of the calculator. 

```