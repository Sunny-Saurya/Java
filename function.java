import java.util.*;
public class function {

    // function with no return type

    public static void printMyName(String name)
    {
        System.out.print("The called name is : ");
        System.out.println(name);
        return;
    }

    // function with return type
    public static int add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    // fucntion with float return type
    public static float divide(int a, int b)
    {
        float result = (float) a / b;
        return result;
    }
    
    public static void main(String[] args) {
        // printMyName("Sunny");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        printMyName(name);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two numbers is : " + add(a, b));
        System.out.println("Division of two numbers is : " + divide(a, b));


        
        
    }
}
