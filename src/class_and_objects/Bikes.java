package class_and_objects;

public class Bikes {
    String BikeName="Hero";
    double price=96325.50;

    public static void main(String[] args) {
        Bikes obj=new Bikes();
        System.out.println("Printing BikeName: "+obj.BikeName);
        System.out.println("Printing Price: "+obj.price);
    }
}
