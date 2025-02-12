import java.util.Scanner;

class Bank{
    private String name;
    private double balance;
    private double deposite;

    public Bank(String name, double balance, double deposite) {
        this.name = name;
        this.balance = balance;
        this.deposite = deposite;
    }

    public void getterFunction(){
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("Deposite: "+deposite);
    }

    public void setterFunction(String name, double balance, double deposite){
        this.name = name;
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
        }
        if(deposite >= 0){
            this.deposite = deposite;
        }
        else{
            System.out.println("Invalid deposite");
        }
    }
}

public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your balance:");
        double balance = sc.nextDouble();
        System.out.println("Enter your deposite:");
        double deposite = sc.nextDouble();
        sc.nextLine();
        Bank b = new Bank(name, balance, deposite);
        b.setterFunction(name, balance, deposite);
        b.getterFunction();
    }
}
