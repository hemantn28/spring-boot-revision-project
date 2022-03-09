package object;

public class Car {

    //data member
    String company_name;
    int model;

    //todo syntax: access_specifier return_type method_name(parameter){CODE}

    //capabilities
    //accomodate
    public void accomodate(){
        System.out.println("This is accomodate method");
    }
    //drive
    public void drive(){
        System.out.println("This is drive method");
    }

    public static void main(String[] args) {
        Car vehicle=new Car();
        vehicle.accomodate();
        vehicle.drive();
    }

}
