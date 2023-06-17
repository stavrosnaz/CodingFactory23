package gr.aueb.cf.ch1.ch2;

public class TypecastApp {
   public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;
        num1 = (int) num2; // typecast καλο να τα αποφευγουμε
        result = num1 + num2;
    }
}
