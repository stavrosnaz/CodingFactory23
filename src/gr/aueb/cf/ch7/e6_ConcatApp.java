package gr.aueb.cf.ch7;

public class e6_ConcatApp {

    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan.";
        String lastname = "Androutsos";
        String fullname;
        String titledFullName;

        fullname = firstname + lastname;
        titledFullName = title.concat(firstname).concat(lastname);
        System.out.println(fullname);
        System.out.println(titledFullName);
    }
}
