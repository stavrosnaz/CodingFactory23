package gr.aueb.cf.ch10.Projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project10 {
    final static boolean[][] seats = new boolean[30][12];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char column;
        int row;
        int choice;
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        do {
            printMenu();
            choice = getChoice();
            if (choice == 1) {
                System.out.println("Please provide a seat to book (Column - Row)");
                column = getColumn();
                row = getRow();
                book(column, row);
            } else if (choice == 2) {
                System.out.println("Please provide a seat to cancel (Column - Row");
                column = getColumn();
                row = getRow();
                cancel(column, row);
            } else {
                System.out.println("Thank you. Have a nice day!!!");
            }
        } while (choice != 3);
    }

    public static void printMenu() {
        System.out.println("What do you wanna do?");
        System.out.println("1. Book a seat");
        System.out.println("2. Cancel a reservation");
        System.out.println("3. Quit");
    }

    public static int getChoice() {
        int choice;
        while (true) {
            if (in.hasNextInt()) {
                choice = in.nextInt();
                if (choice >= 1 && choice <= 3 ) {
                    break;
                } else {
                    in.nextLine();
                    System.out.println("Not a valid choice. Please choose between 1-3");
                    printMenu();
                }
            } else {
                in.nextLine();
                System.out.println("Invalid type of data. Please insert an int");
                printMenu();
            }
        }

        return choice;
    }

    public static char getColumn() {
        char column;
        while (true) {
                System.out.print("Column (A-L): ");
                column = in.next().toUpperCase().charAt(0);
                if (column >= 'A' && column <= 'L') {
                    break;
                } else {
                    System.out.println("Not a valid column");
                }
        }

        return column;
    }

    public static int getRow() {
        int row;
        while (true) {
            System.out.print("Row (1-30): ");
            if (!(in.hasNextInt())) {
                in.nextLine();
                System.out.println("Wrong type of data. Please insert an int");
            } else {
                row = in.nextInt();
                if (row >= 1 && row <= 30) {
                    break;
                } else {
                    in.nextLine();
                    System.out.println("Not a valid row");
                }
            }
        }

        return row;
    }

    public static void book(char column, int row) {
        row--;
        column -= 65;
        if (!seats[row][column]) {
            seats[row][column] = true;
            System.out.printf("You booked seat: %c%d \n", column + 65, row + 1);
        } else {
            System.out.println("The seat is already booked");
        }
    }

    public static void cancel(char column, int row) {
        row--;
        column -= 65;
        if (seats[row][column]) {
            seats[row][column] = false;
            System.out.printf("You canceled seat: %c%d \n", column + 65, row + 1);
        } else {
            System.out.println("The seat you try to cancel is not booked");
        }
    }
}
