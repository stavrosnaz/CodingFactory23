package gr.aueb.cf.ch7;

import java.util.Scanner;

public class e2_StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please provide a string");
//        s = in.next(); // ends with whitespase (space, tab \t, new line \n)
        s = in.nextLine();

        System.out.println(s);
    }
}
