import java.util.Scanner;

public class factorial {
    
    public static int factorial(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        else return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.print("The answer is : ");
        System.out.println(factorial(a));

    }
}
