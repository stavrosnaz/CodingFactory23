package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 *  Διαβαζει ενα char με την
 *  System.in.read
 */
public class CharInputApp {
    public static void main(String[] args) throws IOException {
        char inputChar = ' ';

        System.out.println("Please insert an ascii char");
        System.in.read();
        inputChar = (char) System.in.read();

        System.out.println("Char: " + inputChar);

    }
}
