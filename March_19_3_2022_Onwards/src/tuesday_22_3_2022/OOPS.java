package tuesday_22_3_2022;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }

}
class Student{
    String name;
    int age;

    public void study(){
        System.out.println("students are studying");
    }
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
            }

}
class Book{
    String name;
    int pages;
    double price;

    public void read(){
        System.out.println("Books are to be read");
    }
    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.pages);
        System.out.println(this.price);
    }

}


public class OOPS {
    public static void main(String[] args) {
        /*Pen p1=new Pen();
        p1.color="blue";
        p1.type="gel";

        p1.write();

        Pen p2=new Pen();
        p2.color="black";
        p2.type="ball point";

        Pen p3=new Pen();
        p3.color="red";
        p3.type="ink";

        p1.printColor();
        p2.printColor();
        p1.printType();
        p2.printType();
        p3.printColor();
        p3.printType();*/

        Student s1=new Student("Shahil",25);

        s1.study();
        s1.getInfo();

       /* Student s2=new Student();
        s2.name="Amit";
        s2.age=12;
        s2.getInfo();

        Student s3=new Student();
        s3.name="Kritika";
        s3.age=15;
        s3.getInfo();*/

        /*Book b1=new Book();
        b1.read();
        b1.name="java";
        b1.pages=340;
        b1.price=150.50;
        b1.displayInfo();

        Book b2=new Book();
        b2.name="Godan";
        b2.pages=60;
        b2.price=100;
        b2.displayInfo();

        Book b3=new Book();
        b3.name="swami Vivekanand";
        b3.pages=350;
        b3.price=156.30;
        b3.displayInfo();*/


    }
}
