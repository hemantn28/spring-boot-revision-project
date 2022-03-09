package parameterized;

public class Bike {
    String bikename;
    double price;

    public Bike(String bikename, double price) {
        this.bikename = bikename;
        this.price = price;
    }

    public static void main(String[] args) {
        Bike obj=new Bike("Hero",85632.50);
        System.out.println("printing bikename: "+obj.bikename);
        System.out.println("printing price: "+obj.price);

        Bike object=new Bike("Bajaj",90365.70);
        System.out.println("printing bikename: "+object.bikename);
        System.out.println("printing price: "+object.price);

        Bike motor=new Bike("TVS",79362.50);
        System.out.println("printing bikename: "+motor.bikename);
        System.out.println("printing price: "+motor.price);

        Bike ride=new Bike("Bullet",250000.000);
        System.out.println("printing bikename: "+ride.bikename);
        System.out.println("printing price: "+ride.price);



    }
}
