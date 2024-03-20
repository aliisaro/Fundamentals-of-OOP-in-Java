package Part1;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 1;

        while (x > -1) {
            System.out.println(" ".repeat(x) + "*" .repeat(y));
            x -= 1;
            y += 2;
        }
    }
}
