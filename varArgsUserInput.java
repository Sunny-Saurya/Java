import java.util.*;
public class varArgsUserInput {

    public static int sum(int... nums)
    {
        int sum = 0;
        for(int arg : nums){
            sum += arg;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number, Saperated by space");
        String input = sc.nextLine();

        String[] inputArray = input.split(" ");
        int[] nums = new int[inputArray.length];

        for(int i = 0; i < inputArray.length; i++){
            nums[i] = Integer.parseInt(inputArray[i]);
        }

        int result = sum(nums);
        System.out.println( "Sum is : "+ result);
    }
}
