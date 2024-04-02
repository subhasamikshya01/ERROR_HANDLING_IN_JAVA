import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a non-negative integer:");
            int n = scanner.nextInt();
            if (n >= 0) {
                double squareRoot = Math.sqrt(n);
                System.out.println("Square root of " + n + " is: " + squareRoot);
            } else {
                throw new ArithmeticException("Cannot find the square root of a negative number");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input or unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}