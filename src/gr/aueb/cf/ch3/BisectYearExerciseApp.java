package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * calculate if a year is
 * bisect or not
 */
public class BisectYearExerciseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 0;


        System.out.println("Please insert a year");
        year = in.nextInt();

        if  ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("The year %d is bisect", year);
        }
        else {
            System.out.printf("The year %d is not bisect", year);
        }
    }
}
