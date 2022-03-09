package object;

public class Almirah {
    //data member
    String maker;
    int age;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}
    //capabilities
    //store
    public void store(){
        System.out.println("This is store method");
    }
    //safe
    public void safe(){
        System.out.println("This is safe method");
    }

    public static void main(String[] args) {
        Almirah shop=new Almirah();
        shop.store();
        shop.safe();

    }
}
