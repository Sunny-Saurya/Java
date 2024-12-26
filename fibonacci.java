import java.util.Scanner;

public class fibonacci {
    
    // fibonacci function by using recusive method
    public static int fibonacci(int n)
    {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    // function by using interation method
    
    public static int fibo(int n)
    {
        int a = 0;
        int b = 1;
        int c;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in the series:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
