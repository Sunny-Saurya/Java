// Write a Java program to create a class Car with attributes brand and speed, and a method to display the details. Create an object of the class and call the method.

import java.util.Scanner;

class Car{
    private String brand;
    private int speed;

    public Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + "Km/h");
    }
}

public class ques12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand of the car:");
        String brand = sc.nextLine();
        System.out.println("Enter the speed of the car:");
        int speed = sc.nextInt();

        Car obj = new Car(brand, speed);
        obj.displayDetails();
        sc.close();
        
    }  
}
