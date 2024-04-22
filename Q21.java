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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matrix addition failed: Array index out of bounds.");
        }

        // Test matrix multiplication
        System.out.println("\nMatrix Multiplication:");
        try {
            int[][] resultMultiplication = multiplyMatrices(matrix1, matrix2);
            printMatrix(resultMultiplication);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matrix multiplication failed: Array index out of bounds.");
        }

        // Test matrix transpose
        System.out.println("\nMatrix Transpose:");
        try {
            int[][] resultTranspose = transposeMatrix(matrix1);
            printMatrix(resultTranspose);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matrix transpose failed: Array index out of bounds.");
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
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

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
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

    public static int[][] transposeMatrix(int[][] matrix) {
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
