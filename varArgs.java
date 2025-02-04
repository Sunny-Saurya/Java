public class varArgs {

    public static int sum(int... args) {
        int sum = 0;
        for(int arg : args) {
            sum += arg;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println( sum(1, 2, 3, 4, 5) );
        // sum(3,4,5);
    }
}
