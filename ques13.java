import java.util.*;

class Student{
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class ques13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your address:");
        String address = sc.nextLine();

        Student st = new Student(name, age, address);
        st.displayDetails();
    }
    
}
