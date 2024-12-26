import java.util.Scanner;

public class ques9 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int row = sc.nextInt();
        System.out.println("Enter columns : ");
        int col = sc.nextInt();

        int arr[][] =  new int[row][col];
        System.out.println("Enter elements in 2D array : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter key to search : ");
        int key = sc.nextInt();
        int flag = 0;

        System.out.println("2D array is : ");
        for(int i=0;i<row;i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(" "+ arr[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j] == key)
                {
                    System.out.println("Element found at position ("+i+","+(j+1)+") ");
                }

            }
            System.out.println();
        }
    }
}
