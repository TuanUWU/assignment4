
package assignment4;
import java.util.Scanner;

public class QuadrantDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: coordinates (x, y)
        System.out.print("Enter x-coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter y-coordinate: ");
        int y = scanner.nextInt();

        // Determine the quadrant or axis
        if (x > 0 && y > 0) {
            System.out.println("The point lies in Quadrant 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in Quadrant 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in Quadrant 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in Quadrant 4.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point is at the origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the X-axis.");
        }
    }
}
