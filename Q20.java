public class ArrayRecursiveTraversal {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        recursiveTraversal(arr, 0);
    }

    public static void recursiveTraversal(int[] arr, int index) {
        // Base case: check if index is within the bounds of the array
        if (index >= 0 && index < arr.length) {
            // Process the element at the current index
            System.out.println("Element at index " + index + ": " + arr[index]);

            // Recursive call with incremented index
            recursiveTraversal(arr, index + 1);
        } else {
            // If index is out of bounds, handle the exception gracefully
            System.out.println("Index " + index + " is out of bounds.");
            // Terminate recursion
            return;
        }
    }
}
