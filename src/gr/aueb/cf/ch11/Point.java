package gr.aueb.cf.ch11;

import java.util.Random;

/**
 * A simple Point Java Bean
 *
 * @version 0.1
 * @since 0.1
 * @author stavrosnaz
 */
public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getPoint() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis()); //generate full random num
        return new Point(rnd.nextInt(101),rnd.nextInt(101));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String pointToString() {
        return "(" + x + " , " + y +")";
    }
}
