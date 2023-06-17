package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αποφασιζει αν ενας int ειναι
 * αρτιος η περιττος
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        boolean isNumEven = false;

        System.out.println("Please give a num (int)");
        n = in.nextInt();

        isNumEven = isEven(n);

        System.out.println("Num " + n + " is even: " + isNumEven);
    }

    /**
     * Evaluates an int if it is even or not
     * @param n     the number to evaluate
     * @return      true, if n is even, false otherwise
     */
    public static boolean isEven(int n) {
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return n % 2 == 0;
    }
}
