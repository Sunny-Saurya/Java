import java.util.Scanner;

class Student{
    private String name;
    private int age;
    private int rollNo;

    public Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public void getfun(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollNo);

    }
}

public class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student:");
        int age = sc.nextInt();
        System.out.println("Enter the roll no of the student:");
        int rollNo = sc.nextInt();

        Student st = new Student(name, age, rollNo);
        st.getfun();
        sc.close();
    }
}
