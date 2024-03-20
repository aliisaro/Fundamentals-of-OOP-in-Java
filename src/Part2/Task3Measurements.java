package Part2;

import java.util.Scanner;
import static java.lang.Math.*;
public class Task3Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight in grams:");
        int grams = Integer.parseInt(scanner.nextLine());

        //leiviskämäärä pyöristettynä alaspäin
        double leiviskät = floor(grams / (20 * 32 * 13.28));

        //ylijäämä määrä grammoina
        double remainder1 = grams - leiviskät * (20 * 32 * 13.28);

        //naulamäärä pyöristettynä alaspäin
        double naulat = floor(remainder1 / (32 * 13.28));

        //ylijäämä määrä grammoina
        double remainder2 = remainder1 - naulat * (32 * 13.28);

        //luotimäärä pyöristettynä alaspäin 2 desimaalin tarkkuudella
        double luodit = floor(remainder2 / 13.28 * 100.0) / 100;


        System.out.printf("3000 grammaa on " + round(leiviskät) + " leiviskää, " + round(naulat) + " naulaa ja " + luodit + " luotia.");
    }
}
