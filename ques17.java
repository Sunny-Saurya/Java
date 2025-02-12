import java.util.Scanner;

class Overloading{

    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
}

public class ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        System.out.println("Enter the fourth number:");
        int d = sc.nextInt();
        Overloading obj = new Overloading();
        System.out.println("Sum of two numbers: " + obj.add(a, b));
        System.out.println("Sum of three numbers: " + obj.add(a, b, c));
        System.out.println("Sum of four numbers: " + obj.add(a, b, c,d));
    }
}
