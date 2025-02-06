// method calling witghout invoking object and check whether the number is prime or not

import java.util.Scanner;


public class construtor_05 {

    static boolean isPrime(int n) {
        if( n <= 1) {
            return false;
        }
        
        // using reccursion
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        // ternary operator
       String Result =  isPrime(num)? "it's a prime number" : "it's not a prime number";
       System.out.println(Result);
        sc.close();
        
    }
}
