import java.util.*;
public class bubbleSort {

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] + " ");

        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {64,34,25,12,22,11,90};
        bubbleSort(arr);
        printArray(arr);

    }
}

// time complexity - O(n^2);
// space complexity - O(1);
