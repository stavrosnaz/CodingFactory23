package gr.aueb.cf.ch3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Διαβαζει ωρες λεπτα και δευτερολεπτα
 * και μετατρεπει σε δευτερολεπτα
 */
public class SecondsApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUITE = 60;
        int totalSeconds = 0;

        System.out.println("Please insert hours, minutes, seconds");
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();
        totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUITE + inputSeconds;
        System.out.printf(Locale.forLanguageTag("el"), "%d hours, %d minutes, %d seconds = %d total seconds", inputHours, inputMinutes, inputSeconds, totalSeconds);

    }
}