package Module1.Part1;

public class Task2_Tree {
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
