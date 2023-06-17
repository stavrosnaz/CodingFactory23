package gr.aueb.cf.ch4.exercises;

import java.util.Scanner;

/**
 *  Ο χρηστης δινει εναν αριθμο n
 *  και εκτυπωνει απο n ως 1 αστερακια
 */
public class DecreasingStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give a number of stars");
        n = in.nextInt();

        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}
