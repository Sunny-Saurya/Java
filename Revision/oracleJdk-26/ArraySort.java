import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Before Sorting
        System.out.println("Before Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sort Array
        java.util.Arrays.sort(arr);

        // After Sorting
        System.out.println("\nAfter Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}