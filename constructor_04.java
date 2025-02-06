// method calling by invoking an object
// WAP that will define the class rectangle , define a class reatangle , initialize its L&B using method & calculate its aeaa by calling other method using object;
import java.util.*;
class Rectangle{
    int length;
    int breadth;
    
    Rectangle(int l,int b){
        length=l;
        breadth=b;

    }
    int calculateArea(){
        return length*breadth;
    }
};


public class constructor_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        System.out.println("Area of rectangle is: "+r.calculateArea());

    }
}
