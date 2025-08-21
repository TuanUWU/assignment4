
package assignment4;
import java.util.Scanner;
public class Academic_Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your average score (0.0 to 10.0): ");
        double score = scanner.nextDouble();

        if (score >= 9.0 && score <= 10.0) {
            System.out.println("Grade: Excellent");
        } else if (score >= 8.0 && score < 9.0) {
            System.out.println("Grade: Good");
        } else if (score >= 6.5 && score < 8.0) {
            System.out.println("Grade: Fair");
        } else if (score >= 5.0 && score < 6.5) {
            System.out.println("Grade: Average");
        } else if (score >= 0.0 && score < 5.0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid score. Please enter a value between 0.0 and 10.0.");
        }
    }
}

