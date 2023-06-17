package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;
import gr.aueb.cf.ch11.HelloUtil;

import java.util.Scanner;
//import static java.lang.Math.abs;
/**
 * prints hello world
 *
 * @author stavrosnaz
 */
public class HelloWorld {

    private Scanner sc = new Scanner(System.in);
    private Point point;
    public static void main(String[] args ) {

        int abs = Math.abs(-3);
        System.out.println("HelloWorld");

        HelloUtil.sayHello();
    }
}
