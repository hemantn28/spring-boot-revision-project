package saturday_2_4_2022;

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
    static String schoolName;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class OOPS {
    public static void main(String[] args) {
       /* Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();*/

        Student.schoolName="DAV";
        System.out.println(Student.schoolName);
        Student s1=new Student("Krishna",24);

        s1.printInfo();



    }
}
