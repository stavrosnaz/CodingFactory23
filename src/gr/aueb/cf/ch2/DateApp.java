package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int date = 0;
        int month = 0;
        int year = 0;

        System.out.printf("Δωσε ημερα μηνα και ετος \n");
        date = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        System.out.printf("%d / %d / %d" , date, month, year);


    }
}
