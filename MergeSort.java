import java.util.Scanner;

class Mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to sort: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        msort(a, 0, a.length - 1);
        
        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void msort(int[] a, int i, int j) {
        if (i < j) {
            int mid = (i + j) / 2;
            msort(a, i, mid);
            msort(a, mid + 1, j);
            merge(a, i, mid, j);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low; // The starting index for the temporary array
        int[] b = new int[a.length]; // Temporary array for merging

        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the first half (if any)
        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements from the second half (if any)
        while (j <= high) {
            b[k] = a[j];
            j++;
            k++;
        }

        // Copy elements from temporary array back to the original array
        for (i = low; i <= high; i++) {
            a[i] = b[i];
        }
    }
}

