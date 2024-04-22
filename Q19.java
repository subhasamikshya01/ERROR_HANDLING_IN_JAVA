import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 7};

        // Sorting the array
        System.out.println("Sorted array:");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // Searching for an element
        int target = 7;
        int index = search(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        // Accessing elements at various indices
        try {
            System.out.println("Element at index 2: " + array[2]);
            System.out.println("Element at index 10: " + array[10]); // Accessing out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage() + ". Please access a valid index.");
        }
    }

    // Binary search implementation
    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
