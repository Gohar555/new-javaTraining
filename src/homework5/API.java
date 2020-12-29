package homework5;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * @author Gohar Farmanyan
 * Homework 5. Points and Lines
 */
public class API {
    public static void main(String[] args) {
        Point point = new Point();
        Line line = new Line();
        Scanner scanner = new Scanner(System.in);

        long x1, x2, y1, y2;

        // set points then get inserted value
        System.out.println("Please insert coordinates of first point");
        point.setFirstPoint(scanner.nextInt(), scanner.nextInt());
        x1 = point.getFirstPoint();
        x2 = point.getFirstPoint();

        System.out.println("Please insert coordinates of second point");
        point.setSecondPoint(scanner.nextInt(), scanner.nextInt());
        y1 = point.getSecondPoint();
        y2 = point.getSecondPoint();

        //Calculate the middle points
        System.out.println("Middle point is = " + (x1 + y1) / 2);
        System.out.println("Middle point is = " + (x2 + y2) / 2);

        //Calculate distance between two points
        System.out.println("Distance between 2 points is " + (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))));

        //Check is given point belong to the area
        System.out.println("Please insert coordinates of line");
        line.isBelongToTheLine(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        //Draw square with given 4 points
        JFrame window = new JFrame();
        window.setTitle("Rectangle");
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        DrawComponent DC = new DrawComponent();
        window.add(DC);
    }
}