
package assignment4;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Case 1: Linear equation if a == 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("This is not an equation.");
            } else {
                double x = -c / b;
                System.out.println("This is a linear equation. Solution: x = " + x);
            }
        } else {
            // Case 2: Quadratic equation
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("The equation has no real roots.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has one double root: x = " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("The equation has two distinct real roots:");
                System.out.println("x₁ = " + x1);
                System.out.println("x₂ = " + x2);
            }
        }
    }
}
