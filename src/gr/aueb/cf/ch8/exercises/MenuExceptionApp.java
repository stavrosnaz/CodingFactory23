package gr.aueb.cf.ch8.exercises;


import java.util.Scanner;

public class MenuExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        printMenu();
        choice = getChoice();
        try {
            printChoice(choice);
        } catch (IllegalArgumentException e) {
            System.out.println("Your choice is not valid");
        }
    }

    public static void printMenu() {
        System.out.println("1. a");
        System.out.println("2. b");
        System.out.println("3. c");
        System.out.println("4. d");
        System.out.println("5. Exit");
    }

    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        int choice = -1;

        if (in.hasNextInt()) {
            choice = in.nextInt();
        } else {
            System.out.println("Error. Choice is not an int");
        }

        return choice;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {
        System.out.println(choice);
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException();
        }
    }
}
