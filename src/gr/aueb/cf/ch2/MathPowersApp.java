package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρισκει το τετραγωνο και τον κυβο
 *
 * ενος ακαιρεου που δινει ο χρηστης
 */
public class MathPowersApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Pleas insert a num (int)");
        inputNum = in.nextInt();

        System.out.printf("num: %d, square: %d, cube: %d",
                inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));
    }
}
