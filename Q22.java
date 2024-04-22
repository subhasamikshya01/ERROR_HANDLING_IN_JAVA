// CustomCheckedException class definition
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

// MatrixOperations class with CustomCheckedException usage
public class MatrixOperations {

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Test matrix addition
        System.out.println("Matrix Addition:");
        try {
            int[][] resultAddition = addMatrices(matrix1, matrix2);
            printMatrix(resultAddition);
        } catch (CustomCheckedException e) {
            System.out.println("Matrix addition failed: " + e.getMessage());
        }

        // Test matrix multiplication
        System.out.println("\nMatrix Multiplication:");
        try {
            int[][] resultMultiplication = multiplyMatrices(matrix1, matrix2);
            printMatrix(resultMultiplication);
        } catch (CustomCheckedException e) {
            System.out.println("Matrix multiplication failed: " + e.getMessage());
        }

        // Test matrix transpose
        System.out.println("\nMatrix Transpose:");
        try {
            int[][] resultTranspose = transposeMatrix(matrix1);
            printMatrix(resultTranspose);
        } catch (CustomCheckedException e) {
            System.out.println("Matrix transpose failed: " + e.getMessage());
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) throws CustomCheckedException {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new CustomCheckedException("Matrices must have the same dimensions for addition.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) throws CustomCheckedException {
        if (matrix1[0].length != matrix2.length) {
            throw new CustomCheckedException("Number of columns in the first matrix must match the number of rows in the second matrix for multiplication.");
        }

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) throws CustomCheckedException {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
