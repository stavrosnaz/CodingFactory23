package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class e5_InputMissmatchExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
            try {
                System.out.println("Please insert a num");
                inputNum = in.nextInt();

                if (inputNum == MAGIC_NUM) {
                    break;
                }
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Wrong type of data. Please insert an int");
            }

        }

        System.out.println("Thanks for using the Magic App");
    }
}
