class LargestOddEven {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 33, 50};
        int even = 0;
        int odd = 0;

        // Assuming you have assigned values to the array a[].

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if (num % 2 == 0 && num > even) {
                even = num;
            }
            if (num % 2 == 1 && num > odd) {
                odd = num;
            }
        }

        System.out.println("Largest even number is: " + even);
        System.out.println("Largest odd number is: " + odd);
    }
}

