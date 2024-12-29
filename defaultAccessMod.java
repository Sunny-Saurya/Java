class defaultAccessMod {
    String message = "Hello, Default!";

    void displayMessage() {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        defaultAccessMod example = new defaultAccessMod();
        System.out.println("Accessing default variable: " + example.message);
        System.out.print("Accessing default method: ");
        example.displayMessage();
    }
}
