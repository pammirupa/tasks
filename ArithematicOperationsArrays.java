class ArithematicOperationsArrays {
    public static void main(String[] args) {
        int i, j, row = 20, column = 20;
        int[][] a = new int[row][column];
        int[][] b = new int[row][column];
        // Assume arrays a and b have been initialized with appropriate values

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
                mod[r][c] = a[r][c] % b[r][c];

                // Check for division by zero before attempting division
                if (b[r][c] != 0) {
                    div[r][c] = (float) a[r][c] / b[r][c];
                    mod[r][c] = (int) a[r][c] % b[r][c];
                } else {
                    // Handle the division by zero case, e.g., set to 0 or display an error message.
                    div[r][c] = 0;
                    mod[r][c] =0;
                     // Setting to 0 as an example, you can change this as needed.
                    System.out.println("Division by zero not allowed at [" + r + "][" + c + "]");
                }

                System.out.println("Addition[" + r + "][" + c + "]: " + add[r][c]);
                System.out.println("Subtraction[" + r + "][" + c + "]: " + sub[r][c]);
                System.out.println("Multiplication[" + r + "][" + c + "]: " + mul[r][c]);
                System.out.println("Division[" + r + "][" + c + "]: " + div[r][c]);
                System.out.println("Modulus[" + r + "][" + c + "]: " + mod[r][c]);
            }
        }
    }
}


