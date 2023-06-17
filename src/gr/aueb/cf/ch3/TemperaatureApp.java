package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασιζει αν χιονιζει
 * με βαση τη θερμοκρασια. Αν η θερμοκρασια ειναι μικροτερη
 * απο 0 τοτε χιονιζει
 */
public class TemperaatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature1");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);

    }
}
