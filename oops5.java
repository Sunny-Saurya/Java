// Inheritance : taking the properties of one class and adding new properties to it .

// Inheritance is used to create a new class from an existing class.

// The new class is called the child class or subclass and the existing class is called the parent class or superclass.

// types of inheritance : 

// 1. single level inheritance

class Shape{ // base class or parent class
    public void area()
    {
        System.out.println("Displays the area of the shape");
    }
}

class Triangle extends Shape{ // child class or subclass 

    public void area(int l, int h){
        System.out.println("Area of the triangle is : " + (l*h)/2);
    }
}

public class oops5 {
    
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        t1.area(5, 6);
        t1.area();

    }
}
