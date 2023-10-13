public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
            {2, 3, 4},
            {5, 6, 7}
        };

        int[][] matrixB = {
            {8, 9},
            {10, 11},
            {12, 13}
        };

        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Display the result matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        if (matrixA[0].length != matrixB.length) {
            throw new IllegalArgumentException("Matrix dimensions are not suitable for multiplication.");
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}
