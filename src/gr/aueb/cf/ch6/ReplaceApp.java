package gr.aueb.cf.ch6;

/**
 * Updates a value in an array
 */
public class ReplaceApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 12};
        replace(arr, 6, 56);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void replace(int[] arr,  int oldVal, int newVal){
        int positionToUpdate = -1;

        if (arr == null) return;
        positionToUpdate = getIndex(arr, oldVal);
        if (positionToUpdate == -1) return;
        arr[positionToUpdate] = newVal;
    }

    public static int getIndex(int[] arr, int value) {
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
