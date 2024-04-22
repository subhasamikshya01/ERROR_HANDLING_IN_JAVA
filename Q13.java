import java.util.Scanner;

public class FunctionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();

            double sinX = Math.sin(x);
            double cosX = Math.cos(x);

            // Check if sin(x) + cos(x) is close to zero to avoid division by zero errors
            if (Math.abs(sinX + cosX) < 0.0001) {
                System.out.println("Error: Division by zero error. sin(x) + cos(x) is zero.");
                return;
            }

            double result = (sinX * cosX) / (sinX + cosX);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Invalid input or arithmetic operation.");
        } finally {
            scanner.close();
        }
    }
}
