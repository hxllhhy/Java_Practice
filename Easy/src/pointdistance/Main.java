package pointdistance;

import java.util.Scanner;

class Point {
    private double x;
    private double y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(Point p) {
        double xx = Math.abs(x - p.x);
        double yy = Math.abs(y - p.y);
        return Math.sqrt(xx*xx + yy*yy);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextDouble()) {
            Point a = new Point(scan.nextDouble(), scan.nextDouble());
            Point b = new Point(scan.nextDouble(), scan.nextDouble());
            System.out.printf("%.2f\n\r",a.getDistance(b));
        }
    }
}
