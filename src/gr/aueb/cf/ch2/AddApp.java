package gr.aueb.cf.ch1.ch2;


/**overflow
 *
 */
public class AddApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        //εντολες
        result = num1 + num2;

        System.out.println("sum" + result);


    }
}
