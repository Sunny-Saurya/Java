// import java.util.*;
// public class conditionalStatement {

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         int age = sc.nextInt();
//         if(age>=18){
//             System.out.println("You are eligible to vote");
//         }
//         else
//         {
//             System.out.println("You are not eligible to vote");
//         }

//         // Checking odd or even

//         if(age % 2 == 0){
//             System.out.println("Age is even");
//         }
//         else
//         {
//             System.out.println("Age is odd");
//         }

//     }
// }

// import java.util.*;
// public class conditionalStatement {

//     public static void main(String[] args) 

//     {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         // checking the  maximum number among these three given input 

//         if(a > b){
//             if(a > c){
//                 System.out.println("A is the maximum number");
//             }
//         }
//         else if(b > c){
//             System.out.println("B is the maximum number");
//         }
//         else{
//             System.out.println("C is the maximum number");
//         }

//     }
// }

import java.util.*;

public class conditionalStatement {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Button 1 is pressed");
                break;
            case 2:
                System.out.println("Button 2 is pressed");
                break;
            case 3:
                System.out.println("Button 3 is pressed");
                break;
            default:
                System.out.println("Invalid button");
                break;

        }

    }
}
