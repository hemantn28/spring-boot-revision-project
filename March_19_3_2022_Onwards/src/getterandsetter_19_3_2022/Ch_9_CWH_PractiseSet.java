package getterandsetter_19_3_2022;

import lombok.Getter;
import lombok.Setter;

 //Q.1.Create a class cylinder and use getters and setters to set its radius and heights.//
 //Q.2.Also calculate the surface area and volume of cylinder//
 //Q.3.Use a constructor for question no.1//
 //Q.4.Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
 //Q.5.Create a class sphere and calculate the surface area and volume of sphere.
@Getter
@Setter

class Sphere{
    private int radius;

    public double volume(){
        //volume of sphere=4/3* pi*r*r*r;
        double volume=(4*Math.PI*radius*radius*radius)/3;
        return volume;
    }
    public double surfaceArea(){
        //surface area of sphere=4*pi*r*r;
        double surfaceArea=4*Math.PI*radius*radius;
        return surfaceArea;
    }


 }
class MyRectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public MyRectangle() {
        this.length = 4;
        this.breadth = 5;

    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

}

@Getter
@Setter

class MyCylinder {
    private double radius;
    private double height;

    // Constructor for Q No.3.
    public MyCylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea(){
        double surfaceArea=(2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
        return surfaceArea;
    }
    public double volume(){
        double volume=Math.PI*radius*radius*height;
        return volume;

    }
}

public class Ch_9_CWH_PractiseSet {
    public static void main(String[] args) {
        MyCylinder cyl=new MyCylinder(9,12);
       /* cyl.setHeight(12);
        System.out.println(cyl.getHeight());
        cyl.setRadius(9);
        System.out.println(cyl.getRadius());

        double surfaceArea=cyl.surfaceArea();
        System.out.println(surfaceArea);

        double volume=cyl.volume();
        System.out.println(volume);*/
        System.out.println(cyl.getRadius()+" "+cyl.getHeight());

        MyRectangle mrc=new MyRectangle(12,56);
        System.out.println(mrc.getLength());
        System.out.println(mrc.getBreadth());

        MyRectangle mrc1=new MyRectangle();

        Sphere sph=new Sphere();
        sph.setRadius(4);
        System.out.println(sph.getRadius());

        double volume=sph.volume();
        System.out.println("volume is "+volume);

        double surfaceArea=sph.surfaceArea();
        System.out.println("SurfaceArea is "+surfaceArea);


   }
}
