import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // Update
        arr.set(1, 1001);

        System.out.println("ArrayList:");

        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // Remove first element
        arr.remove(0);

        System.out.println("After Remove:");

        for(int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        // HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);

        System.out.println("\nValue at key 2: " + map.get(2));


        //Hashset

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        for(int x : set) {
            System.out.println(x);
        }


        // Queue
        
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        for(int x : q){
            System.out.println(x);
        }

        System.out.println(q.peek());

        int rem = q.poll();
        System.out.println(rem);

        System.out.println(q.peek());


        // Stack

        Stack<Integer> st = new Stack<>();

        st.push(101);
        st.push(201);
        st.push(301);
        st.push(401);

        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }

    }
}