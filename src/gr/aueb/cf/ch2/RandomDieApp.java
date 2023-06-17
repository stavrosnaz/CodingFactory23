package gr.aueb.cf.ch1.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1; //στο Math.random να κανω typecast
        System.out.println(die);


    }
}
