package gr.aueb.cf.ch7;

/**
 * Replaces a string
 */
public class e5_ReplaceApp {

    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashedTitle;

        dashedTitle = title.replace(" ", "-");
        System.out.println(dashedTitle);
    }
}
