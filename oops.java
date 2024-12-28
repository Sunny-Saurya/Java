class Pen{
    String color;
    String type;

    // method function
    public void write()
    {
        System.out.println("Writing...");
    }

    public void printColor()
    {
        // System.out.println("Color: " + color);
        System.out.println("Color: " + this.color);

    }
}

public class oops {
    
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Ballpoint";

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Rollerball";

        pen1.write();
        System.out.println(pen1.color);
        System.out.println(pen1.type);
        pen1.printColor();

        pen2.write();
        System.out.println(pen2.color);
        System.out.println(pen2.type);
        pen2.printColor();


    }
}
