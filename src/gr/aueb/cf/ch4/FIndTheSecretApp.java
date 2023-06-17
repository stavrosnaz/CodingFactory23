package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *  o χρηστης εχει 10 ευκαιριες για να
 *  βρει ενα μυστικο κλειδι (int). Αν το
 *  βρε πριν τη 10η φορα η for πρεπει να σταματησει
 */
public class FIndTheSecretApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++){
            System.out.println("Please make a guess");
            num = in.nextInt();
            if (num == SECRET_KEY){
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No worries, play again");
            System.exit(1);
        }

        System.out.println("Success!! Play again");
    }
}
