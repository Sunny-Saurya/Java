public class recursion {
    
    public static void printNumber(int n)
    {
        if(n == 0) return;
        System.out.println(n);
        printNumber(n-1);

    }

    public static void printNumber2(int n)
    {
        if(n == 0) return;
        printNumber2(n-1);
        System.out.println(n);
    }

    public static int sumOfNaturalNumber(int n)
    {
        if(n == 0) return 0;
        return n + sumOfNaturalNumber(n-1);

    }

    public static int factorial(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return n * factorial(n-1);
    }

    public static void printFibonacci(int a, int b, int n)
    {
        if(n == 0) return;
        System.out.println(a);
        printFibonacci(b, a+b, n-1);

    }

    public static int power(int n, int x)
    {
        if(x == 0) return 1;
        return n * power(n, x-1);
        
    }
    public static void main(String[] args)
    {
        int n = 5; 

        // printing natural number from n to 1 using recursion

        printNumber(n);


        // printion natural number from 1 to n;
        printNumber2(n);

        // printing sum of first n natural number using recursion

        int sum = sumOfNaturalNumber(n);
        System.out.println("Sum of first " + n + " natural number is " + sum);

        // printing factorial of n using recursion

        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);

        // printing fibonacci series using recursion

        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series is ");
        printFibonacci(a, b, n);

        // printing x^n stack height = n using recursion
        int x = 2;
        int n1 = 3;
        System.out.println("x^n is " + power(x, n1));

    }
}
