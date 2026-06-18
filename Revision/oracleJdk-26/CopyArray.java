import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] copy = java.util.Arrays.copyOf(arr, arr.length);

        System.out.println("\nCopied Array:");
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}