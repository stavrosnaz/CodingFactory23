package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρηση των break και continue
 */
public class BreakContinueApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true){
            System.out.println("Please provide a num");
            num = in.nextInt();
            if (num == 5){
                continue;
            }
            sum = sum + num;
            if (num == 10) {
                System.out.println("Bingo!!!");
                break;
            }
        }

        System.out.println(sum);
    }
}
