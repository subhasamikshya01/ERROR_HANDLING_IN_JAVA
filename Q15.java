import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            
            // Outer try-catch block to handle NumberFormatException
            try {
                int number = Integer.parseInt(input);
                
                // Inner try-catch block to handle ArithmeticException
                try {
                    int result = 10 / number;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: ArithmeticException caught inside the inner try-catch block.");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: NumberFormatException caught inside the outer try-catch block.");
            }
            
        } catch (Exception e) {
            System.out.println("Error: Exception caught in the outer try-catch block.");
        } finally {
            scanner.close();
        }
    }
}
