package gr.aueb.cf.ch6;

public class MissingArrayElement {

    public static void main(String[] args) {

    }

    public static int getMissing(int[] arr) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1; // δεν ισχυει
        }
        return -1;
    }
}
