class ArithmeticOperationsArrays {
    public static void main(String[] args) {
        int row = 3; // Specify the number of rows in the arrays
        int column = 3; // Specify the number of columns in the arrays

        int[][] a = { {1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9} };

        int[][] b = { {9, 8, 7},
                      {6, 5, 4},
                      {3, 2, 8} }; // Note: b[2][2] is set to 0 to test division by zero

        int[][] add = new int[row][column];
        int[][] sub = new int[row][column];
        int[][] mul = new int[row][column];
        float[][] div = new float[row][column];
        float[][] mod = new float[row][column];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                add[r][c] = a[r][c] + b[r][c];
                sub[r][c] = a[r][c] - b[r][c];
                mul[r][c] = a[r][c] * b[r][c];

                // Check for division by zero before attempting division
                if (b[r][c] != 0) {
                    div[r][c] = (float) a[r][c] / b[r][c];
                } else {
                    // Handle the division by zero case, e.g., set to 0 or display an error message.
                    div[r][c] = 0;
                    System.out.println("Division by zero not allowed at [" + r + "][" + c + "]");
                }

                mod[r][c] = a[r][c] % b[r][c];
            }
        }

        System.out.println("Addition:");
        printArray(add);

        System.out.println("\nSubtraction:");
        printArray(sub);

        System.out.println("\nMultiplication:");
        printArray(mul);

        System.out.println("\nDivision:");
        printArray(div);

        System.out.println("\nModulus:");
        printArray(mod);
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(float[][] arr) {
        for (float[] row : arr) {
            for (float element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

