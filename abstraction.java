abstract class Animal{  // abstract class
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken is walking");
    }
}

public class abstraction {
    public static void main(String[] args ) {
        Horse h = new Horse();
        h.walk();
        Chicken c = new Chicken();
        c.walk();

        // Animal ani = new Animal();
        // ani.walk(); // throws error

        
    }
}
