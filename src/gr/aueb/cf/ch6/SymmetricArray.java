package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--); {
            if (arr[1] != arr[2]) { // αντι για 1 και 2 το σωστο ειναι να βαλω i και j
                isSymmetric = false;
            }
        }

        return isSymmetric;

    }
}
