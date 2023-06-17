package gr.aueb.cf.ch6.exercises;

public class GetMaxPositionEx1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int maxPosition;

        maxPosition = getMaxPosition(arr, 0, arr.length);
        System.out.print(maxPosition);

    }

    /**
     * Finds the position of max value of an array
     * @param arr       The array
     * @param low       The starting point of array
     * @param high      The arrays lenfth
     * @return          The position of max value
     */
    public static int getMaxPosition(int[] arr, int low, int high) {

        int maxPosition = low;
        int maxValue = arr[low];

        if ((low < 0) || (high > arr.length)) {
            System.out.println("Error in array dimensions");
            return -1;
        }
        for (int i = low; i < high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
