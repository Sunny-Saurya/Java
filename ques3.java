import java.util.*;
public class ques3 {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 1; i < 11; i++)
        {
            System.out.println(n * i);
        }
    }
}
