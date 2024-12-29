public class accessModifier {
    public String message = "Hello, World!";

    public void displayMessage() {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        accessModifier example = new accessModifier();
        System.out.println("Accessing public variable: " + example.message);
        System.out.print("Accessing public method: ");
        example.displayMessage();
    }
}
