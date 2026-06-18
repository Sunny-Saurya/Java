import java.util.*;

public class CollectionsDemo{
    public static void main(String[] args){

        // for dynamic array

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // get using index

        // System.out.println(arr.get(0));
        // update
        arr.set(1, 1001);
        
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        // remove

        arr.remove(0);


        for(int x : list){
            System.out.print(x+" ");
        }
        
    }
}