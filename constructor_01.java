// user defined method

import java.util.Scanner;

public class constructor_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String result =  str.replaceAll("[AEIOUaeiou]", "#");
        System.out.println("String after removing vowels: " + result);

        sc.close();
    }
}
