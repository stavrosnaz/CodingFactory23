package gr.aueb.cf.ch7;

public class e1_StringDeclaration {

    public static void main(String[] args) {
        String alice = "Alice";
        String alice2 = "Alice";
        String bob = new String("Bob"); // Δεν συνηθιζεται

        System.out.println(alice);
        System.out.printf("%s\n", alice2);
        System.out.println(alice + " " + bob);
    }
}
