package gr.aueb.cf.ch5.exercises;

import java.util.Scanner;

/**
 *  Εκτυπώνει ενα menu, ο χρήστης επιλέγει
 *  ενα νούμερο και ανάλογα την επιλογή
 *  καλείται η κατάλληλη μέθοδος για να
 *  εκτελεστεί η επιλογή αυτή.
 */
public class MenuStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        int stars;

        do {
            printMenu();
            System.out.println("Δώσε επιλογή");
            choice = in.nextInt();
            if (isChoiceValid(choice)) {
                System.out.println("Μη έγκυρη επιλογή");
                continue;
            }
            if (isChoiceQuit(choice)) {
                System.out.println("Τέλος προγράμματος");
                break;
            }
            System.out.println("Δώσε αριθμό για αστεράκια");
            stars = in.nextInt();
            printStars(choice, stars);
        } while (true);
    }

    /**
     * Εκτυπώνει ένα menu
     */
    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    /**
     * Ελέγχει αν αυτο που έδωσε ο χρήστης είναι έγκυρο
     * @param choice        Επιλογή χρήστη
     * @return              Επιστρέφει true ή false
     */
    public static boolean isChoiceValid(int choice) {
        return choice < 1 || choice > 6;
    }

    /**
     * Ελέγχει αν πρέπει να σταματήσει το πρόγραμμα
     * @param choice        Επιλογή του χρήστη
     * @return              Επιστρέφει true ή false
     */
    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    /**
     * Εμφανίζει τα αστεράκια με βάση την επιλογή του χρήστη
     * @param choice        Επιλογή χρήστη
     * @param stars         Αριθμός απο τα αστεράκια
     */
    public static void printStars (int choice, int stars) {
        if (choice == 1) {
            chooseOne(stars);
        } else if (choice == 2) {
            chooseTwo(stars);
        } else if (choice == 3) {
            chooseThree(stars);
        } else if (choice == 4) {
            chooseFour(stars);
        } else {
            chooseFive(stars);
        }
    }

    /**
     * Εμφανίζει n αστεράκια οριζόντια
     * @param stars     τα αστεράκια που δίνει ο χρήστης
     */
    public static void chooseOne(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    /**
     * Εμφανίζει n αστεράκια κάθετα
     * @param stars     τα αστεράκια που δίνει ο χρήστης
     */
    public static void chooseTwo(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }

    /**
     * Εμφανίζει nxn αστεράκια
     * @param stars     τα αστεράκια που δίνει ο χρήστης
     */
    public static void chooseThree(int stars) {
        for (int i = 1; i <= stars; i++){
            chooseOne(stars);
        }
    }

    /**
     * Εμφανίζει n γραμμές με αστεράκια 1 – n
     * @param stars     τα αστεράκια που δίνει ο χρήστης
     */
    public static void chooseFour(int stars) {
        for (int i = 1; i <= stars; i++) {
            chooseOne(i);
        }
    }

    /**
     * Εμφανίζει n γραμμές με αστεράκια n - 1
     * @param stars     τα αστεράκια που δίνει ο χρήστης
     */
    public static void  chooseFive(int stars) {
        for (int i = stars; i >= 1; i--) {
            chooseOne(i);
        }
    }
}
