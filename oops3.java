class Student{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non - paramaterize constructor
    // Student()
    // {
    //     System.out.println("Constructor called");
    // }

    // parameterized constructor
    // Student(String name, int age){
        // this.name = name;
        // this.age = age;
    // }

    // copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    Student()
    {

    }
}

public class oops3 {
    public static void main(String[] args) {
        // Creating an object of the class
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;

        Student s2 = new Student(s1); // copy constructor
        s2.printInfo();
    }
}
