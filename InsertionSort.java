import java.util.*;
class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 10, 1, 6, 2};
        int[] a = new int[arr.length]; // Declare a new array 'a'
                    // Copy elements from 'arr' to 'a'
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];

        }
    

        int temp, i, j;
        for (i = 1; i < arr.length; i++) {
            temp = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (i = 0; i < arr.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
