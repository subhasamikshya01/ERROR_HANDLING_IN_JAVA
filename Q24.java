import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionHandler {

    public static void main(String[] args) {
        try {
            // Attempt to open a non-existent file
            Scanner scanner = new Scanner(new File("non_existent_file.txt"));

            // If the file is found, this line won't be executed
            System.out.println("File opened successfully.");

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
            // You might also log the exception or perform other error handling tasks here
        }
    }
}
