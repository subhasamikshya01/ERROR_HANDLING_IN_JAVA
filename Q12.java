import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();

            // Check if tan(x) + 1 equals to zero
            if (Math.abs(Math.tan(x) + 1) < 0.0001) {
                System.out.println("Error: Division by zero error. tan(x) + 1 is zero.");
                return;
            }

            double sinX = Math.sin(x);
            double cosX = Math.cos(x);

            // Check if sin(x) * cos(x) is negative
            if (sinX * cosX < 0) {
                System.out.println("Error: Invalid input. Result is imaginary due to negative value inside square root.");
                return;
            }

            double sqrtValue = Math.sqrt(Math.abs(sinX * cosX));
            double tanPlusOne = Math.tan(x) + 1;

            double result = sqrtValue / tanPlusOne;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
