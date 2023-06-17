package gr.aueb.cf.ch5;

/**
 * Υπολογιζει αναδρομικα το a ^ n
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    /**
     * Recursive a^n
     * @param a     the base
     * @param n     the poewr
     * @return      the power of base number
     */
    public static float power(float a, float n) {
        if (n == 0) return 1;
        if (n < 0)  return 1 / a * power(a, -n);
        return a * power(a, n - 1);
    }
}
