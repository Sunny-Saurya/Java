class Employee{
    private String name;
    private int age;
    private double salary;

    // Getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge()
    {
        return age;
    }

    // setter for age
    public void setAge(int age)
    {
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Age should be greater than 0");
        }
    }

    // getter for salary
    public double getSalary()
    {
        return salary;
    }

    // setter for salary
    public void setSalary(double salary){
        if(salary >= 0){
            this.salary = salary;
        }
        else{
            System.out.println("Salary should be greater than or equal to 0");
        }
    }

    public void displayAllInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Employee: " + this.salary);
    }
}

public class encapsulation {

    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setName("Sunny");
        emp.setAge(25);
        emp.setSalary(50000);
        emp.displayAllInfo();
    }


    
}
