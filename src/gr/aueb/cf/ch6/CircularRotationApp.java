package gr.aueb.cf.ch6;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1,2 ,3 ,4};
        int[] rotated = doCircularRightShiftBy(arr, 2);
        printArray(rotated);

    }

    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotatedRight = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotatedRight[(i + offset) % arr.length] = arr[i];
        }

        return rotatedRight;
    }

    public static int[] doCircularLeftShiftBy (int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotatedLeft = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotatedLeft[i] = arr[(i + offset) % arr.length];
        }

        return rotatedLeft;
    }

    public static void printArray(int [] arr) {
        if(arr == null) return;
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
