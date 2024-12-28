class Pen{
    String color;
    String type;

    // method function
    public void write()
    {
        System.out.println("Writing...");
    }

    public void printColor()
    {
        // System.out.println("Color: " + color);
        System.out.println("Color: " + this.color);

    }
}

class Student
{
    String name;
    int age;

    // method
    public void printInfo()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}

public class oops2 {
    
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.printInfo();
        System.out.println();
        
        Student s2 = new Student();
        s2.name = "Alice";
        s2.age = 22;
        s2.printInfo();
        System.out.println();
    }
}
