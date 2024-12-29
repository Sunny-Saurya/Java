// POLYMORPHISM
// 2 TYPES : Method Overriding and Method Overloading

// Method Overriding : When a subclass provides a different implementation of a method that is already defined in its superclass.

// Method Overloading : When two or more methods in the same class have the same name but different parameters.
// It is also known as compile-time polymorphism.
// It is used to perform a different task with the same method name.


class Student{
    String name;
    int age;

    public void printInfo(String name)
    {
        System.out.println("Name : " + this.name);
    }

    public void printInfo(int age)
    {
        System.out.println("Age : " + this.age);
    }

    public void printInfo(String name, int age)
    {
        System.out.println("Name : "+ this.name + " Age : " + this.age);
    }
}

public class oops4 {
    public static void main(String[] args) {
        // Creating an object of the class
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;

        s1.printInfo(23);
        s1.printInfo("Rahul");
        s1.printInfo("Rahul", 20);
    }
}
