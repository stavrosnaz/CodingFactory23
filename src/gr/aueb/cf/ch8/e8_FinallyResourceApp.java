package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class e8_FinallyResourceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        try {
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
                in.close();

        }

    }
}
