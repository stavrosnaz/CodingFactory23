package gr.aueb.cf.ch3;

import java.util.Scanner;

/** μετατρεπει ευρω σε δολαρια
 *
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99; //με το final βαζω οτι ειναι σταθερα (parity = ισοτιμια)

        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt(); //περιμενει να διαβασει εναν ακαιρεο

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d dollars, %d cents", inputEuros, usaDollars, usaCents);



    }
}
