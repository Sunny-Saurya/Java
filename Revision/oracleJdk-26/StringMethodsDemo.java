import java.util.*;

public class StringMethodsDemo {
    public static void main(String[] args) {

        String s = "Sunny Kumar";

        // 1. Length
        System.out.println("Length: " + s.length());

        // 2. Character Access
        System.out.println("charAt(0): " + s.charAt(0));

        // 3. Substring
        System.out.println("substring(6): " + s.substring(6));
        System.out.println("substring(0,5): " + s.substring(0,5));

        // 4. Compare Strings
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + "HELLO".equalsIgnoreCase("hello"));

        // 5. Contains
        System.out.println("contains(\"Kumar\"): " + s.contains("Kumar"));

        // 6. StartsWith / EndsWith
        System.out.println("startsWith(\"Sun\"): " + s.startsWith("Sun"));
        System.out.println("endsWith(\"mar\"): " + s.endsWith("mar"));

        // 7. IndexOf / LastIndexOf
        String str = "banana";
        System.out.println("indexOf('a'): " + str.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + str.lastIndexOf('a'));

        // 8. Upper / Lower
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("toLowerCase: " + s.toLowerCase());

        // 9. Replace
        System.out.println("replace: " + "apple".replace('p', 'x'));

        // 10. Trim
        String t = "   hello   ";
        System.out.println("trim: '" + t.trim() + "'");

        // 11. Split
        String csv = "a,b,c,d";
        String[] arr = csv.split(",");
        System.out.println("Split:");
        for(String x : arr) {
            System.out.println(x);
        }

        // 12. Concatenation
        String name = "Sunny";
        System.out.println(name.concat(" Kumar"));

        // 13. isEmpty
        System.out.println("isEmpty: " + "".isEmpty());

        // 14. CompareTo (Lexicographical)
        System.out.println("abc compareTo abd: " + "abc".compareTo("abd"));

        // 15. String to Char Array
        char[] chars = s.toCharArray();
        System.out.println("toCharArray:");
        for(char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();

        // 16. ValueOf
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("valueOf: " + numStr);

        // =========================
        // StringBuilder Methods
        // =========================

        StringBuilder sb = new StringBuilder("Hello");

        // append
        sb.append(" World");
        System.out.println("append: " + sb);

        // insert
        sb.insert(5, " Java");
        System.out.println("insert: " + sb);

        // delete
        sb.delete(5, 10);
        System.out.println("delete: " + sb);

        // deleteCharAt
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sb);

        // reverse
        sb.reverse();
        System.out.println("reverse: " + sb);

        // length
        System.out.println("length: " + sb.length());

        // charAt
        System.out.println("charAt(0): " + sb.charAt(0));

        // setCharAt
        sb.setCharAt(0, 'X');
        System.out.println("setCharAt: " + sb);

        // toString
        String finalStr = sb.toString();
        System.out.println("toString: " + finalStr);
    }
}