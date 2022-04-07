package sunday_20_3_2022;

import lombok.Getter;
import lombok.Setter;

//Q.1.Create a class cylinder and use getters and setters to set its radius and heights.
//Also calculate the surface area and volume of cylinder
//Q.3.Use a constructor for question no.1
//Q.4.Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
//Q.5.Create a class sphere and calculate the surface area and volume of sphere.

@Getter
@Setter
class Cylinder{
    private int radius;
    private int height;

    //calculate surfaceArea thru return type method
    public double surfaceArea(int radius,int height){
        //surfaceArea of cylinder=(2*PI*r*h)+(2*PI*r*r);
        double surfaceArea=(2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
        return surfaceArea;
    }
    //calculate volume thru input parameter method
    public void volume(double radius, double height){
        //Volume of cylinder=PI*r*r*h;
        double volume=Math.PI*radius*radius*height;
        System.out.println("volume is "+volume);

    }
    //constructor for Q.No.3


    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}
//Q.4.
@Getter
@Setter
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}
//Q.5. Create a class sphere and calculate the surface area and volume of sphere.
class Sphere{
    double radius;

    //calculating volume of sphere thru input parameter method.
    //volume of sphere=4/3* pi*r*r*r;
    public void volume(double radius){
        double volume=(4*Math.PI*radius*radius*radius)/3;
        System.out.println("volume is "+volume);
    }
    //calculating surfaceArea thru return type method
    public double surfaceArea1(double radius){
        //surface area of sphere=4*pi*r*r;
        double surfaceArea1=4*Math.PI*radius*radius;
        return surfaceArea1;
    }

}
    public class Ch_9_Practise_Set_CWH {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder(5, 10);
        cl.setRadius(5);
        System.out.println(cl.getRadius());
        cl.setHeight(10);
        System.out.println(cl.getHeight());
        double surfaceArea = cl.surfaceArea(5, 10);
        System.out.println("surfaceArea is " + surfaceArea);
        cl.volume(5, 10);

        Rectangle rct = new Rectangle(12, 10);
        rct.setBreadth(8);
        System.out.println(rct.getBreadth());
        rct.setLength(10);
        System.out.println(rct.getLength());

        Sphere sph=new Sphere();
        sph.volume(8);
        double surfaceArea1=sph.surfaceArea1(8);
        System.out.println("surfaceArea1 is "+surfaceArea1);




    }
}
