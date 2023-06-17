package gr.aueb.cf.ch6.exercises;

/**
 * Finds the second min value
 * of an array doing two searches
 */
public class SecondMinEx2 {

    public static void main(String[] args) {
        int[] arr = {5, 4, 72, 9, 87, 23, 3, 65, 6, 7};
        int min;
        int min2;

        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The first min value of the array is: " + min);

        min2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < min2) && (arr[i] > min)){
                min2 = arr[i];
            }
        }

        System.out.println("The second min value of the array is: " + min2);
    }
}
