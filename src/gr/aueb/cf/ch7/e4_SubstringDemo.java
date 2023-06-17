package gr.aueb.cf.ch7;

public class e4_SubstringDemo {

    public static void main(String[] args) {
        String s = "Athens Uni of Economics and Bus";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));
        }
    }
}
