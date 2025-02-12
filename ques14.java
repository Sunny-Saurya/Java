// Create a BankAccount class with a private variable balance. Implement getter and setter methods to access and update the balance.

import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}

public class ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance:");
        double a = sc.nextDouble();
        BankAccount ba = new BankAccount(a);
        System.out.println("Your balance is: "+ba.getBalance());

    }
}
