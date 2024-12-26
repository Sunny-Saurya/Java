public class AllOperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));

        // Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        int c = 5, d = 3; // Binary: c = 0101, d = 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("c & d: " + (c & d));
        System.out.println("c | d: " + (c | d));
        System.out.println("c ^ d: " + (c ^ d));
        System.out.println("~c: " + (~c));
        System.out.println("c << 1: " + (c << 1));
        System.out.println("c >> 1: " + (c >> 1));

        // Assignment Operators
        int e = 10;
        System.out.println("\nAssignment Operators:");
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);
        e -= 3; // e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2; // e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 2; // e = e / 2
        System.out.println("e /= 2: " + e);
        e %= 3; // e = e % 3
        System.out.println("e %= 3: " + e);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int f = 5;
        System.out.println("f: " + f);
        System.out.println("++f: " + (++f)); // Pre-increment
        System.out.println("f++: " + (f++)); // Post-increment
        System.out.println("f: " + f);
        System.out.println("--f: " + (--f)); // Pre-decrement
        System.out.println("f--: " + (f--)); // Post-decrement
        System.out.println("f: " + f);

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // Instanceof Operator
        System.out.println("\nInstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
