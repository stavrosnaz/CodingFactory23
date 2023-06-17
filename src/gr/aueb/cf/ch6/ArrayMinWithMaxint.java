package gr.aueb.cf.ch6;

public class ArrayMinWithMaxint {

    public static void main(String[] args) {
        int[] arr = {6, 90, 4, 17};

        int minPotition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPotition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min Value: %d, Min Potition: %d", minValue, minPotition + 1);
    }
}
