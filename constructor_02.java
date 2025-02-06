import java.util.Scanner;

public class constructor_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check the armstrong number");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int store = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, count);
            temp = temp / 10;
        }
        if(sum == store){
            System.out.println(n + " is an armstrong number");
        }
        else{
            System.out.println(n + " is not an armstrong number");
        }


    }
}
