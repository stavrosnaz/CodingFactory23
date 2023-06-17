package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 *  Λαμβανει 3 τιμες απο τον χρηστη
 *  a, b ,c οπου a η υποτεινουσα και b, c
 *  οι δυο αλλες πλευρες και ελεγχει
 *  αν το τριγωνο ειναι ορθογωνιο
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        System.out.println("Please insert 3 doubles");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Is Right");
        } else {
            System.out.println("Is not Right");
        }
    }
}
