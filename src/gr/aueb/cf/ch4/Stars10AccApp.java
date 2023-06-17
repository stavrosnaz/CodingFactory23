package gr.aueb.cf.ch4;

/**
 * Eκτυπωνει σε αυξουσα σειρα
 * 1, 2, 3, ... , 10 αστερακια
 * σε καθε γραμμη
 */
public class Stars10AccApp {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
