package monday_21_3_2022;

class Mates{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Mates(String name, int age){
        System.out.println("constructor called");
        this.name=name;
        this.age=age;
    }

}
public class Pen {

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

    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="Blue";
        p1.type="Gel";

        p1.write();

        Pen p2=new Pen();
        p2.color="black";
        p2.type="ball point";

        p1.getColor();
        p2.getColor();

        p1.getType();
        p2.getType();

        Mates m1=new Mates("Aman",24);
        m1.printInfo();

    }
}
