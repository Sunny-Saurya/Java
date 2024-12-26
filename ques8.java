import java.util.Scanner;

public class ques8 {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key to search : ");
        int key = sc.nextInt();

        for(int i = 0; i < size; i++)
        {
            if(arr[i] == key)
            {
                System.out.println(
                    "Element is present at index " + i);
                    return;
                
            }

        }
    }
}
