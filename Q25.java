import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Call the method to read an integer
        int userInput = readInteger(scanner);
        System.out.println("You entered: " + userInput);

        // Close the scanner
        scanner.close();
    }

    public static int readInteger(Scanner scanner) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer: ");
            try {
                // Try to read an integer from the user
                number = scanner.nextInt();
                validInput = true; // Set flag to true if input is valid
            } catch (InputMismatchException e) {
                // Handle InputMismatchException
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return number;
    }
}
