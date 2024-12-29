class protectedAccessMod {
    protected String message = "Hello, Protected!";

    protected void displayMessage() {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        protectedAccessMod example = new protectedAccessMod();
        System.out.println("Accessing protected variable: " + example.message);
        System.out.print("Accessing protected method: ");
        example.displayMessage();
    }
}
