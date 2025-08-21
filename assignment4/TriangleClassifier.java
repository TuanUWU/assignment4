
package assignment4;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: three side lengths
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Check triangle validity
        if (a + b > c && a + c > b && b + c > a) {
            // Valid triangle — classify it
            if (a == b && b == c) {
                System.out.println("This is an Equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("This is an Isosceles triangle.");
            } else {
                System.out.println("This is a Scalene triangle.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}
