package gr.aueb.cf.ch6;

public class ArraySearchApp {
    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1, 5, 9, 3, 12};
        boolean secretIsFound = false;
        int count = 0;

        for (int item : arr) {
            count = count + 1;
            if (item == SECRET) {
                secretIsFound = true;
                break;
            }
        }

        if (secretIsFound) {
            System.out.println("Secret Key was found");
        } else {
            System.out.println("Secret Key was not found");
        }
        System.out.println(count);
    }
}
