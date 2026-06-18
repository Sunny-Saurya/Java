import java.util.*;

public class Palindrome{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int i = 0, j = str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("False");
                return;
            }
            i++;
            j--;
        }

        System.out.println("True");

    }
}