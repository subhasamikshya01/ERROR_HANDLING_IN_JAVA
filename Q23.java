import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessing {

    public static void main(String[] args) {
        String filename = "data.txt"; // Change this to your file's path

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            // Read data from the file
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of data (in this example, just printing)
                System.out.println(line);
            }

            // Close the file
            reader.close();
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            // You might also log the exception or perform other error handling tasks here
        }
    }
}
