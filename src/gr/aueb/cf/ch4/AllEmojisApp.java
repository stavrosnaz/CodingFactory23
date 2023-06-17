package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Prints all emojis
 */
public class AllEmojisApp {
    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int i = 0;
        int count = 0;

        i = emojiStart;
        while (i <= emojiEnd) {
            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i = i + 1;
            if (i % 16 == 0) System.out.println(); // για να τα εμφανιζει σε 16αδες
        }
    }
}
