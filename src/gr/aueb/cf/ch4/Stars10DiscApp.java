package gr.aueb.cf.ch4;

/**
 * Εκτυπωνει 10, 9 , 8, ... , 1
 * αστερακια σε καθε γραμμη
 */
public class Stars10DiscApp {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
