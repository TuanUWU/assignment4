
package assignment4;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use the ternary operator to find the absolute value
        int absoluteValue = (number >= 0) ? number : -number;

        // Print the result
        System.out.println("The absolute value is: " + absoluteValue);

        scanner.close();
    }
}
