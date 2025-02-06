// paramatrized contructor
// WAP to define class employee with parametrized construtor that initialize employee name, salary, and then display them

import java.util.Scanner;

class Employee{
    String name;
    int salary;

    Employee(String name, int sal) {
        this.name = name;  
        salary = sal;
    }

    void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }

}

public class constructor_06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        int sal = sc.nextInt();
        Employee e = new Employee(name, sal);
        e.display();
        sc.close();
        
    }
}
