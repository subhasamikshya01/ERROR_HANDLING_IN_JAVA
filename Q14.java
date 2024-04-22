import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();

            double sinX = Math.sin(x);
            double cosX = Math.cos(x);
            double tanX = Math.tan(x);
            double cotX = 1 / tanX; // cot(x) = 1 / tan(x)

            // Check if tan(x) - cot(x) is close to zero to avoid division by zero errors
            if (Math.abs(tanX - cotX) < 0.0001) {
                System.out.println("Error: Division by zero error. tan(x) - cot(x) is zero.");
                return;
            }

            double expressionValue = Math.log(Math.abs(sinX + cosX)) / (tanX - cotX);

            // Check if the value inside the logarithm is negative
            if (sinX + cosX <= 0) {
                System.out.println("Error: Invalid input. Result is imaginary due to negative value inside logarithm.");
                return;
            }

            System.out.println("Result: " + expressionValue);
        } catch (Exception e) {
            System.out.println("Error: Invalid input or arithmetic operation.");
        } finally {
            scanner.close();
        }
    }
}
