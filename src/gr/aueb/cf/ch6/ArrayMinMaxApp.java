package gr.aueb.cf.ch6;

/**
 * Αναζητά το ελαχιστο και το μεγιστο
 * στοιχειο ενος πινακα
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};

        int minPotition = 0;
        int minValue = arr[minPotition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPotition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min Value: %d, Min Potition: %d", minValue, minPotition + 1);
    }
}
