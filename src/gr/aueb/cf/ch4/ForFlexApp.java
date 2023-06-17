package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *  διαβαζει απο το πληκτρολογιο το
 *  start value, end value και το step
 *  και εκτυπωνει το πληθος των επαναληψεων
 */
public class ForFlexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.println("Please insert start, end, step");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i = i + step){
            iterations = iterations + 1;
        }

        System.out.println("Interations: " + iterations);
    }
}
