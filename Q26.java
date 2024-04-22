public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Attempt to load a class that doesn't exist
            Class<?> clazz = Class.forName("NonExistentClass");

            // Attempt to invoke a method that doesn't exist
            clazz.getMethod("nonExistentMethod");
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException
            System.out.println("Class not found: " + e.getMessage());
            // You might also log the exception or perform other error handling tasks here
        } catch (NoSuchMethodException e) {
            // Handle NoSuchMethodException
            System.out.println("Method not found: " + e.getMessage());
            // You might also log the exception or perform other error handling tasks here
        } finally {
            // This block always executes, regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
            // You might close resources or perform cleanup tasks here
        }
    }
}
