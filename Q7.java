import java.util.Scanner;

public class Q7 {
    static Scanner scanner = new Scanner(System.in);

    public static Integer convertToInteger(String input) {
        Integer result = null;
        while (result == null) {
            try {
                result = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Input is not a valid integer. Please enter a valid number:");
                input = scanner.nextLine();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        String input = scanner.nextLine();
        Integer number = convertToInteger(input);
        System.out.println("The number entered is: " + number);
        scanner.close();
    }
}