package class_and_object;

public class Car {
    //data member
    String name="Skoda";
    String model="Rapid";
    double price=1199999.00;

    public static void main(String[] args) {
        //creating objects: Classname objectname=new Classname();
        Car obj=new Car();
        System.out.println(obj.name+" "+obj.model+" "+obj.price);
    }
}
