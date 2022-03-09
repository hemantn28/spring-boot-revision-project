package class_and_objects;

public class Student {
    String name="Ramesh";
    int rollNo=37;
    String section="A";

    public static void main(String[] args) {
        Student obj=new Student();
        System.out.println("printing student name: "+obj.name);
        System.out.println("printing rollno: "+obj.rollNo);
        System.out.println("printing section: "+obj.section);
    }
}
