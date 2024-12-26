// public class array {
    
//     public static void main(String[] args) 
//     {
//         // int[] marks = new int[5];
//         int marks[] = new int[5]; // both are correct ways to initilize an array.
//         marks[0] = 90;
//         marks[1] = 80;
//         marks[2] = 70;
//         marks[3] = 60;
//         marks[4] = 50;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         // System.out.println(marks[3]);
//         // System.out.println(marks[4]);

//         // Accessing using loop
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Marks of student " + (i + 1) + " is " + marks[i]);
//         }


//     }
// }


// taking input from the user

import java.util.Scanner;

public class array {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : " );
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Number " + (i + 1) + " is " + number [i]);
        }

    }
}
