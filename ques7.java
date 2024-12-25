import java.util.*;
public class ques7 {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int r = sc.nextInt();

        System.out.print("Enter the number of rows :");
        int c = sc.nextInt();

        for(int i = 1; i <= r; i++)
        {
            for(int j = i+1; j <= c; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }


        
    }
}
