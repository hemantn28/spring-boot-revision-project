package class_and_object;

public class Bike {
    //data member
    String name="Royal Enfield";
    String model="Thunderbird";
    double price=250000.00;

    public static void main(String[] args) {
        //creating object: Classname objectname=new Classname
        Bike obj=new Bike();
        System.out.println(obj.name);
        System.out.println(obj.model);
        System.out.println(obj.price);
    }
}
