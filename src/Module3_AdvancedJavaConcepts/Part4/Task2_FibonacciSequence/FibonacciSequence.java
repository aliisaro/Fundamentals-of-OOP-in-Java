package Module3_AdvancedJavaConcepts.Part4.Task2_FibonacciSequence;
import java.io.*;
public class FibonacciSequence {
    private final static String FILENAME = "fibonacci.csv";
    public static void main(String[] args) {
        File file = new File(FILENAME);

        try (FileWriter fw = new FileWriter(FILENAME);
             BufferedWriter bw = new BufferedWriter(fw)) {
            int n1=0,n2=1,n3=0;

            for (int i = 0; i < 100; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                bw.write(Integer.toString(n3));
                bw.write(","); // Separate values with a comma
                bw.newLine(); // Move to the next line
            }

            System.out.println("Fibonacci sequence written to file: " + FILENAME);

        } catch (Exception e) {
            System.err.println("Writing int: " + e);
        }
    }
}
