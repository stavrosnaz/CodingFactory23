package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Typecast from String to int.
 */
public class e10_TypecastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexene;
        int num;

        System.out.println("Please insert a num (int)");
        lexene = in.next();
        num = Integer.parseInt(lexene);

        System.out.println("Num is " + num);

    }
}
