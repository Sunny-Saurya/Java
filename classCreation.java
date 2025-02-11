public class classCreation{

    public static class Student{
            String name;
            int rollNo;
            double percent;
    }
    public static void main(String[] args) {

        Student x = new Student();
        x.name =  "Sunny";
        x.rollNo =  1;
        x.percent =  92.0;

        System.out.println("name "+ x.name);
        System.out.println("rollNo "+ x.rollNo);
        System.out.println("percent "+ x.percent);

    }
    
}