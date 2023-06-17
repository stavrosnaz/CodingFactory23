package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εκτυπωνει n οριζοντια αστερακια
 * οπου n ενας ακαιρεος που δινει ο χρηστης
 */
public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 0;

        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        while (i <= numberOfStars) {
            System.out.print("*");
            i++;
            if (i % 50 == 0) {  // για να αλλαζει γραμμη καθε 50 *
                System.out.println();
            }
        }
    }
}
