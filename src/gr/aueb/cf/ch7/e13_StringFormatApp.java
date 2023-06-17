package gr.aueb.cf.ch7;

public class e13_StringFormatApp {

    public static void main(String[] args) {
        char row = 'B';
        int column = 10;

        String seat = String.format("%c%d", row, column);

        System.out.println(seat);
    }
}
