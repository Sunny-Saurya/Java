class Student{
    String name;
    int age;
    static String schoolName; // static variable 

    public  static void changeSchool()
    {
        schoolName = "Gs ps";
    }
}

public class staticFunction {
    
    public static void main(String[] args) {
        Student.schoolName = "MSM "; // static variable can be accessed using class name 
        
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = " Rahul";
        s1.age = 20;
        s2.name = "John";
        s2.age = 20;
        System.out.println(s1.schoolName);
        Student.changeSchool();
        
        System.out.println(s2.schoolName);

    }
}
