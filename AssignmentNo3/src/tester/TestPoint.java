package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x y):");
        Point2D p1 = new Point2D(sc.nextInt(), sc.nextInt());

        System.out.println("Enter coordinates for Point 2 (x y):");
        Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());

        System.out.println("P1 Details: " + p1.getDetails());
        System.out.println("P2 Details: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("p1 & p2 are located at the same position.");
        } else {
            System.out.println("Points are different.");
            System.out.println("Distance between p1 & p2: " + p1.calculateDistance(p2));
        }
        sc.close();
    }
}
