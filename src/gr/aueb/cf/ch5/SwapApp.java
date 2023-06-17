package gr.aueb.cf.ch5;

/**
 * Ανταλλασσει αμοιβαια δυο τιμες που
 * δινει ο χρηστης
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println("a = " + a + " b = " + b);
    }

    /**
     * Swaps a, b, a -> b, b -> a
     * @param a     first value
     * @param b     second value
     */
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
