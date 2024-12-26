import java.util.Scanner;

public class strings {
    
    public static void main(String[] args) 
    {
        // String literal
        // String str = "Hello, World!";
        // String name = "John Cena";

        // INput from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        // concatenation in string

        String str = "Hello, ";
        String name1 = "Sunny Kumar,";
        String str2 = (" Nice to meet you !!");
        System.out.println(str + name1 + str2);
        
        // length of string

        String str3 = "Hello, World!";
        System.out.println("Length of string is: " + str3.length());

        // for loop in string using charAt();

        String str4 = "Hello, World!";
        for (int i = 0; i < str4.length(); i++) {
            System.out.println(str4.charAt(i));
        }

        // comparing two strings
        // s1 > s2 : return +ve value
        // s1 == s2 : return 0
        // s1 < s2 : return -ve value

        String str5 = "Hello, World!";
        String str6 = "Hello, World!";
        System.out.println(str5.equals(str6));
        System.out.println(str5.equalsIgnoreCase(str6));
        System.out.println(str5.compareTo(str6));
        System.out.println(str5.compareToIgnoreCase(str6));

        if(str5.compareTo(str6) == 0)
        {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        // substring in string
        String str7 = "Hello, World!";
        System.out.println(str7.substring(0, 5));
        System.out.println(str7.substring(7, 12));
        System.out.println(str7.substring(0, str7.length()));
        System.out.println(str7.substring(str7.length() - 5));
        System.out.println(str7.substring(0, str7.length() - 5));
        System.out.println(str7.substring(0, str7.length() - 5));
        System.out.println(str7.substring(0, str7.length() - 5));
        System.out.println(str7.substring(0, str7.length() - 5));

    }
}
