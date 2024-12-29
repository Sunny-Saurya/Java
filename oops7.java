// Inheritance : taking the properties of one class and adding new properties to it .

// Inheritance is used to create a new class from an existing class.

// The new class is called the child class or subclass and the existing class is called the parent class or superclass.

// types of inheritance : 

// 2. Multi level inheritance

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

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of the circle is : " + 3.14*r*r);
    }
}

public class oops7 {
    
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        t1.area(5, 6);
    

    }
}
