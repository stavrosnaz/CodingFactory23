package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ενας μικρος βατραχος θελει να περασει ενα ποταμι.
 * ο frog βρισκεται στη θεση Χ και θελει να φτασει στη
 * θεση Y (ή σε θεση μεγαλυτερη απο τη θεση Y). Ο frog κανει jump
 * a fixed distance D.
 *
 * Το προγραμμα αυτο βρισκει το ελαχιστο αριθμο
 * jumps που ο frog πρεπει να κανει ωστε να φτασει στο στοχο του ή
 * να τον ξεπερασει
 * πχ Αν εχουμε χ = 10 y = 15 και d = 30 τοτε ο forg θα χρειαστει
 * 3 jumps γιατι θα ξεκινησει απο το 10 και μετα το πρωτο jump θα παει
 * στη θεση jump 10 + 30 = 40. Στο 2ο jump θα παει στο 40 + 30 = 70 και στο
 * 3ο jump παει στο 70 + 30 = 100
 */
public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int startPoint;
//        int endPoint;
//        int jumpDistance;
//        int jumps = 0;
//
//        System.out.println("Please insert start point, end point and jump distance");
//        startPoint = in.nextInt();
//        endPoint = in.nextInt();
//        jumpDistance = in.nextInt();
//        for (int i = startPoint; i < endPoint; i = i + jumpDistance){
//            jumps = jumps + 1;
//        }
//
//        System.out.println("Jumps: " + jumps);
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y-x) / (double) jmp);
        System.out.println("Jumps: " + jumps);
    }
}
