
package tuesday_22_3_2022;

class Students{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String  name, int age){
        System.out.println(name+" "+age);
    }
}

class Shape{
    String color;
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle{
    public void area(int r){
        System.out.println(Math.PI*r*r);
    }
}

public class OOPS2 {
    public static void main(String[] args) {
        Students sts1=new Students();
        sts1.name="Ravi";
        sts1.age=23;

        sts1.printInfo(sts1.name+" "+sts1.age);

        Triangle t1=new Triangle();
        t1.color="red";






    }
}
