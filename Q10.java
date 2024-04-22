import java.util.Scanner;

public class TrigonometricExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();

            // Handle scenarios where x is close to multiples of π/2 to avoid division by zero
            if (Math.abs(x - Math.PI/2) < 0.0001 || Math.abs(x - (3*Math.PI)/2) < 0.0001) {
                System.out.println("Error: Division by zero error. x is close to multiples of π/2.");
                return;
            }

            double sinX = Math.sin(x);
            double cosX = Math.cos(x);
            double tanX = Math.tan(x);

            double result = (sinX + cosX) / tanX;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
