package gr.aueb.cf.ch10.Projects;

import java.util.Arrays;
import java.util.Scanner;

public class Project8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        int row;
        int column;
        int player;
        boolean win = false;
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
        System.out.println("Please choose who will start the game of tic tac toe.");
        player = choosePlayer();
        do {
            if (player == 1) {
                printBoard(board);
                do {
                    System.out.println("Player 1, please insert a row(1-3)");
                    row = getPosition();
                    System.out.println("Player 1, please insert a column(1-3)");
                    column = getPosition();
                    if (verifyPosition(board, row, column)) {
                        board[row][column] = 'X';
                        break;
                    }
                } while (true);
                player = 2;
            } else {
                printBoard(board);
                do {
                    System.out.println("Player 2, please insert a row(1-3)");
                    row = getPosition();
                    System.out.println("Player 2, please insert a column(1-3)");
                    column = getPosition();
                    if (verifyPosition(board, row, column)) {
                        board[row][column] = 'O';
                        break;
                    }
                } while (true);
                player = 1;
            }
            win = checkWin(board);
            count++; // counts the rounds to find if the game is draw.
            if (count == 9) {
                break;
            }
        } while (!win);
        //Check if there is a winner or the game is draw
        if (win) {
            // Changes the player who is about to play to the player that played last and won.
            if (player == 1){
                player = 2;
            } else {
                player = 1;
            }
            System.out.println("Player " + player + " has won");
        } else {
            System.out.println("The outcome of the game is Draw");
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("    1   2   3  ");
        System.out.println("1 | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("  |---|---|---|");
        System.out.println("2 | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("  |---|---|---|");
        System.out.println("3 | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
    }

    public static int choosePlayer() {
        int player;
        do {
            System.out.println("1. Player 1 (X)");
            System.out.println("2. Player 2 (O)");
            if (in.hasNextInt()) {
                player = in.nextInt();
                if (player == 1 || player == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please insert a valid choice");
                }
            } else {
                in.nextLine();
                System.out.println("Invalid data. Please insert a valid choice");
            }
        } while (true);

        return player;
    }

    public static int getPosition() {
        int position;
        while (true) {
            if (!(in.hasNextInt())) {
                in.nextLine();
                System.out.println("Wrong type of data. Please insert an int");
            } else {
                position = in.nextInt();
                if (position >= 1 && position <= 3) {
                    break;
                } else {
                    in.nextLine();
                    System.out.println("Not a valid position");
                }
            }
        }

        return position - 1;
    }

    public static boolean verifyPosition(char[][] arena, int row, int column) {
        if (arena[row][column] == ' ') {
            System.out.println("Choice has been placed!!!");
            return true;
        } else {
            System.out.println("You can't place your choice in this position!!!");
            return false;
        }
    }

    public static boolean checkWin(char[][] a) {
        boolean win = false;
        for (int i = 0; i < a.length; i++) {
            if ((a[i][0] == a[i][1]) && (a[i][1] == a[i][2]) && (a[i][1] != ' ')) {
                win = true;
            }
            if ((a[0][i] == a[1][i]) && (a[1][i] == a[2][i]) && (a[1][i] != ' ')) {
                win = true;
            }
        }
        if ((a[0][0] == a[1][1]) && (a[1][1] == a[2][2]) && (a[1][1] != ' ')) {
            win = true;
        }
        if ((a[2][0] == a[1][1]) && (a[1][1] == a[0][2]) && (a[1][1] != ' ')) {
            win = true;
        }
        return win;
    }



}
