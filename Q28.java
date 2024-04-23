public class StackOverflowExample {

    public static void main(String[] args) {
        try {
            recursiveMethod(0);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred: " + e.getMessage());
            // Log the error or perform any necessary cleanup
            System.exit(1); // Exit the program gracefully
        }
    }

    public static void recursiveMethod(int i) {
        // Recursive method causing stack overflow
        recursiveMethod(i + 1);
    }
}
