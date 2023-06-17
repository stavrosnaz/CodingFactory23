package gr.aueb.cf.ch3;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        long facto = 1L;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while ( i <= n) {
            facto = facto * i;
            i++;
        }
        System.out.printf("%d! = %,d", n, facto);

    }
}
