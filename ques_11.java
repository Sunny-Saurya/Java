import java.util.*;
public class ques_11 {
    // finding armstrong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;
        int temp = n;

        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        temp = n;
        while(temp > 0){
            int rem  = temp % 10;
            sum = sum + (int)Math.pow(rem, count);
            temp = temp / 10;
        }
        if(sum == n){
            System.out.println(n + " is an armstrong number");
        }
        else{
            System.out.println(n + " is not an armstrong number");
        }

    }
}
