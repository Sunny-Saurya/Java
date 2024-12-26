import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        
        // string builder
        StringBuilder sb  = new StringBuilder("Sunny");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert at index
        sb.insert(0, 'S');
        System.out.println(sb);

        // insert at 2 index
        sb.insert(2, 'T');
        System.out.println(sb);

        // delete from - to -
        sb.delete(0, 3);
        System.out.println(sb);

        // append in string 
        sb.append('Y');
        sb.append('W');
        sb.append('V');
        System.out.println(sb);

        // length of string
        System.out.println(sb.length());
    }
}
