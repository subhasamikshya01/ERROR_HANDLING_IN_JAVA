import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            
            int[] array = new int[size];
            
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();
            
            // Accessing the array element at the specified index
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Please enter a valid index.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input or unexpected exception occurred.");
        } finally {
            scanner.close();
        }
    }
}

