import java.util.*;
public class dowhile {
    
    public static void main(String[] args) {
        // dowhile loop
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Please enter a positive number");
            num = sc.nextInt();
        }
        while(num < 0);
        System.out.println("Value Inserted");
        
        
    }
}
