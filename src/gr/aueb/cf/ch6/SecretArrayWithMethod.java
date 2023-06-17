package gr.aueb.cf.ch6;

/**
 *  Αναζητα ενα στοιχειο σε εναν πινακα
 */
public class SecretArrayWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
    }

    /**
     * επιστρεφει το index του στοιχειου που αναζητα.
     * Αν δεν το βρει επιστρέφει -1
     * @param arr
     * @param value
     */
    public static int getElementPosition(int[] arr, int value) {
        int potition = 0;

        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                potition = i;
                break;
            }
        }
        return potition;
    }
}
