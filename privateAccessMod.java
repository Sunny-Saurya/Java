class privateAccessMod {
    private String message = "Hello, Private!";

    private void displayMessage() {
        System.out.println(message);
    }

    public void accessPrivateMethod() {
        displayMessage();
    }
}

class Main {
    public static void main(String[] args) {
        privateAccessMod example = new privateAccessMod();
        // Cannot access private members directly
        // System.out.println(example.message); // This will cause an error
        // example.displayMessage();           // This will cause an error

        System.out.print("Accessing private method via public method: ");
        example.accessPrivateMethod();
    }
}
