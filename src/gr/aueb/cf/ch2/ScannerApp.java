package gr.aueb.cf.ch1.ch2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * διαβαζει απο το std input (πληκτρολογιο)
 * δυο ακεραιους και τους προσθετει
 */
public class ScannerApp {
    public static void main(String[] args) {
        //Δηλωση μεταβλητων
        Scanner in = new Scanner(System.in); //εισαγω πληροφοριες (Διαβασε στο αεππ)
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        // Εντολες
        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);


    }
}
