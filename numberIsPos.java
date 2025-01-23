import java.util.Scanner;

public class numberIsPos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num > 0){
            if(num % 5 == 0){
                System.out.println(num + " is a positive number and is divisible by 5");

            } 
            else{
                System.out.println(num + " is a positive number but is not divisible by 5");
            }

        }
        else{
            System.out.println(num + " is not a positive number");
        }

    }
}