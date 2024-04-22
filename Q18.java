public class ArraySumCalculator {
    public static int calculateSum(int[] array) {
        return calculateSumRecursive(array, 0);
    }

    private static int calculateSumRecursive(int[] array, int index) {
        // Base case: if index is out of bounds, return 0
        if (index < 0 || index >= array.length) {
            return 0;
        }

        // Recursive case: add current element and recurse for the next index
        return array[index] + calculateSumRecursive(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Calculate sum
        int sum = calculateSum(array);
        System.out.println("Sum of elements: " + sum);

        // Introduce scenarios where recursion goes beyond array bounds
        try {
            System.out.println("Attempting to calculate sum with invalid index:");
            int invalidIndexSum = calculateSumRecursive(array, array.length);
            System.out.println("Sum with invalid index: " + invalidIndexSum); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
