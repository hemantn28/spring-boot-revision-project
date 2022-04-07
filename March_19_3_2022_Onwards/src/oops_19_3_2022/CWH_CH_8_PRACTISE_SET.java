package oops_19_3_2022;

/*CREATE A CLASS EMPLOYEE WITH FOLLOWING PROPERTIES AND METHODS
salary(property)(int)
getSalary(method returning int)
name(property)(String)
getName(method returning String)
setName(method changing name)*/

class Employee{

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;

    }
}

//Create a class cellphone with methods to print "ringing..." , "vibrating..."  etc.
class Cellphone{
    public void ring(){
        System.out.println("Mobile is ringing");
    }
    public  void vibrate(){
        System.out.println("Mobile is vibrating");
    }
}

//Create a class square with a method to initialize its side, calculating area and perimeter etc.
class Square{
    int side;

    //calculating area thru input parameter method
    public void area(int side){
        int area=side*side;
        System.out.println(area);
    }
    //calculating perimeter thru return type method
    public int perimeter(int side){
        int perimeter=4*side;
        return perimeter;
    }

}

//Q.4.Create a class Rectangle with a method to initialize its side ,calculating area, perimeter etc.

class Rectangle{
    int length;
    int breadth;

//calculating area thru return type method.

    public int area(int length, int breadth){
        int area=length*breadth;
        return area;
    }
    //calculating perimeter thru input parameter  method.
    public void perimeter(int length, int breadth){
        int perimeter=2*(length*breadth);
        System.out.println(perimeter);

    }
}

//Q.4.Create a class Tommy Vecetti for Rockstar games capable of hitting(print hitting), running and firing etc.
class TommyVecetti{

    public void hit(){
        System.out.println("hitting the target");
    }
    public void run(){
        System.out.println("running behind the target");
    }
    public void fire(){
        System.out.println("firing the target");
    }
}
//Q.5.Create a class circle with a method to initialize its radius calculating area and circumference.

class Circle{
    //area of circle= pi*r*r
    //circumference of circle=2*pi*r

    //calculating area of circle thru input parameter method
    public void area(double radius){
        double area=Math.PI*radius*radius;
        System.out.println(area);
    }
    //calculating circumference thru return type method.
    public double circumference(double radius){
        double circumference=2*Math.PI*radius;
        return circumference;
    }
}
/*Online Problem.  Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named
       'Triangle' without any parameter in its constructor.*/
class Triangle{
    int base;
    int height;
    int hypotenuse;

//calculating area thru return type method
    public double area1(int base, int height){
        double area1=(base*height)/2;
        return area1;
    }
    //calculating perimeter thru input parameter method.
    public void perimeter1(int base, int length, int hypotenuse){
        int perimeter1=base*length*hypotenuse;
        System.out.println("perimeter1 is "+perimeter1);

    }
}

public class CWH_CH_8_PRACTISE_SET {
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.setName("Rahul");
        System.out.println(emp.getName());
        emp.salary=56983;
        System.out.println(emp.getSalary());
        System.out.println(emp.getName());

        Cellphone cp=new Cellphone();
        cp.ring();
        cp.vibrate();

        Square sq=new Square();
        sq.area(4);
        int perimeter=sq.perimeter(5);
        System.out.println(perimeter);

        Rectangle rc=new Rectangle();
        int area=rc.area(5,6);
        System.out.println(area);

        rc.perimeter(5,6);

        TommyVecetti tv=new TommyVecetti();
        tv.fire();
        tv.hit();
        tv.run();

        Circle cc=new Circle();
        cc.area(5);
        double circumference=cc.circumference(5);
        System.out.println(circumference);

        Triangle tr=new Triangle();
        double area1=tr.area1(3,4);
        System.out.println("area1 is "+area1);
        tr.perimeter1(3,4,5);


    }
}
