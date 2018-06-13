package Vqiu;

import java.util.Scanner;

class Ball {
    private double radius;
    Ball(double radius) {
        this.radius = radius;
    }
    public double getV(double radius) {
        return 4.0/3*3.1415927*radius*radius*radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextDouble()) {
            double r = scan.nextDouble();
            Ball ball = new Ball(r);
            System.out.printf("%.3f\n\r", ball.getV(r));
        }
    }
}
