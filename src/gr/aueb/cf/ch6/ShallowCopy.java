package gr.aueb.cf.ch6;

/**
 * Makes a copy of an array
 */
public class ShallowCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];

        //Shallow copy
//        arr2 = arr1;

        for (int item : arr1) {
            System.out.println(item + " ");
        }

        //Hard copy
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
