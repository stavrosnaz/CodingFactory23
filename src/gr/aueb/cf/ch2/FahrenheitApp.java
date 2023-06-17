package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitApp {
    public static void main(String[] args) {
        //Δηλωση μεταβλητων
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;
        //Εντολες
        System.out.printf("Δωσε θερμοκρασια Fahrenheit \n");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("Η θερμοκρασια σε βαθμους Celsius ειναι: %d" , celsius);



    }
}
