package gr.aueb.cf.ch6;

/**
 *  Εκτυπωνει ενα πινακα με τη χρηση μεθοδου
 */
public class PrintArrayMethod {

    public static void main(String[] args) {
        int [] ages = {19, 25, 34, 42};

        printArray(ages);
    }

    public static void printArray(int [] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int [] arr, int low, int high) {
        if (arr == null) return;
        if (low < 0 || high > arr.length - 1) return;

        for (int i =0; i <= high; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
