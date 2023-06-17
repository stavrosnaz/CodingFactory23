package gr.aueb.cf.ch4.exercises;

import java.util.Scanner;

/**
 *  Ο χρηστης δινει εναν αριθμο n
 *  και εκτυπωνει nxn αστερακια
 */
public class BoxTypeStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
