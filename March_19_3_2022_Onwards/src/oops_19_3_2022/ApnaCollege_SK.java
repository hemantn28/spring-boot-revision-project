package oops_19_3_2022;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void getColor(){
        System.out.println(this.color);
    }
    public void getType(){
        System.out.println(this.type);
    }
}
class Scholar{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
public class ApnaCollege_SK {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.write();
        p1.color="Blue";
        p1.type="gel";
        p1.getColor();
        p1.getType();

        Pen p2=new Pen();
        p2.color="Black";
        p2.type="ball point";
        p2.getType();
        p2.getColor();

        Scholar sch=new Scholar();
        sch.name="Ramesh";
        sch.age=20;
        sch.printInfo();

        Scholar sch2=new Scholar();
        sch2.name="Shivank";
        sch2.age=25;
        sch2.printInfo();

    }
}
