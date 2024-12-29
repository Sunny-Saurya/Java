// getter & setter is user to access and modify the private variables 

class Account{
    public String name;
    public String email;
    private String password;

    // getter
    public String getPassword(){
        return this.password;
    }
    // setter
    public void setPassword(String password){
        this.password = password;
    }
}

public class getterSetterFunc {
    
    public static void main(String[] args) {
        Account act = new Account();
        act.name = " John";
        act.email = "john@gmail.com";
        act.setPassword("123456");
        System.out.println("Name: "+act.name); 
        System.out.println(act.getPassword());// now we can  access the private variable 

    }
}
