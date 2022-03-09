package object;

public class Building {
    //data member
    String builder_name;
    int age;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}
    //capabilities
    //accomodate
    public void accomodate(){
        System.out.println("This is accomodate method");
    }
    //prevents
    public void prevents(){
        System.out.println("This is prevents method");
    }

    public static void main(String[] args) {
        Building home=new Building();
        home.accomodate();
        home.prevents();
    }
}
