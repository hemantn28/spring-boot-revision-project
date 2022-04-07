package sunday_20_3_2022;


// Q.1. Create a class circle & use inheritance to create another class Cylinder1 from it.
//Q.2. Create a class Rectangle and use inheritance to create another class cuboid.
// Try to keep it as close to the real world scenario as possible.

class Circle{

    public double radius;

    Circle(){
        System.out.println("I m non-parameterised constructor of circle");
    }

    public Circle(double r) {
        System.out.println("i m circle parameterised constructor");
        this.radius = r;
    }

    //calculating area thru return type method
    public double area(double radius){
        double area=Math.PI*radius*radius;
        return area;
    }
    //calculating area thru input parameter method.
    public void area1(double radius){
        double area1=Math.PI*radius*radius;
        System.out.println("Area from Input Parameter method is "+area1);


    }
}
class Cylinder2 extends Circle{
    public double height;

    public Cylinder2(double r, double height) {
        super(r);
        System.out.println("i m cylinder2 parameterised constructor");
        this.height = height;
    }

    public double volume(double radius, double height){
        double volume=Math.PI*radius*radius*height;
        return volume;
    }

}
public class Ch_10_PractiseSet_CWH {
    public static void main(String[] args) {
       // Circle cc=new Circle(12);
       // double area=cc.area(4);
        //System.out.println("Area from Return Type method is "+area);
        //cc.area1(4);

        Cylinder2 ccl1=new Cylinder2(4,8);
        //double volume=ccl1.volume(4,8);
        //System.out.println("Volume of cylinder is "+volume);

    }
}
