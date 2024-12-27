public class bitManipulate {
    
    public static void main(String[] args) {

        // get bit at index 2 
        int num = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if((bitMask & num) == 0){
            System.out.println("Bit at index " + pos + " is 0");
        }
        else{
            System.out.println("Bit at index " + pos + " is 1");
        }

        // set bi8t at index 2 to 1

        num = 5;
        pos = 2;
        bitMask = 1 << pos;
        num = num | bitMask;
        System.out.println("Number after setting bit at index " + pos + " to 1 is " + num);

        // clear bit at index 2

        num = 5;
        pos = 2;
        bitMask = 1 << pos;
        num = num & ~bitMask;
        System.out.println("Number after clearing bit at index " + pos + " is " + num );

        // update bit at index 2 to 1
        num = 5;
        pos = 2;
        bitMask = 1 << pos;
        // for 1
        num = num | bitMask;
        // for 0
        num = num & ~bitMask;
        System.out.println("Number after updating bit at index " + pos + " to 1 is " + num);
        


    }
}
