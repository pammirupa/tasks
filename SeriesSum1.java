public class SeriesSum1 {
    public static void main(String[] args) {
        int n = 2; // numerator initial value is 2
        int d = 9; // denominator initial value
        float t;
        int m = 1;
        float sum = 0;

        for (int i = 2; i <= 5; i++) {
            int updatedN = n + 3; // Calculate updated numerator
            int updatedD = d + 4; // Calculate updated denominator
            m *= -1; // alternative sign for m
            t = (float) updatedN / updatedD;
            sum += t * m; // accumulate sum
            System.out.println("sum is: " + (t * m));

            // Update n and d for the next iteration
            n = updatedN;
            d = updatedD;
        }
    }
}

