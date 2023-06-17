package gr.aueb.cf.ch8;

public class e4_NullPointerExceptApp {

    public static void main(String[] args) {
        String s = "Coding";

        if (s != null) {
            if (s.equals("Coding")) {
                System.out.println("Bingo");
            } else {
                System.out.println("not equal");
            }
        } else {
            System.out.println("s is null");
        }
    }
}
