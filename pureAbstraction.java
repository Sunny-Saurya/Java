interface Animal{
    void walk();

}

interface Herbivore{

}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Horse is walking");
    }
}

class Dog implements Animal, Herbivore{
    public void walk(){
        System.out.println("Dog is walking");
    }
}

public class pureAbstraction {
    public static void main(String[] args) {
        
        Animal horse = new Horse();
        Animal dog = new Dog();
        horse.walk();
        dog.walk();
    }
}
