public class loops {
    
    public static void main(String[] args) 
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Hello World in Java");
        }

        // print 1- 10 value

        // for(int i = 0; i < 11; i++)
        // {
        //     System.out.println(i);
        // }

        // same code using while loop
        // int i = 0;
        // while(i < 11)
        // {
        //     System.out.println(i);
        //     i++;
        // }

        // same code using do-while loop
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i < 11);
    }
}
