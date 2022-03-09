package class_and_objects;

public class Student {
    String StudentName="Rohan";
    int RollNo=36;
    String Section="C";

    public static void main(String[] args) {
        Student obj=new Student();
        System.out.println("Printing StudentName: "+obj.StudentName);
        System.out.println("Printing RollNo.: "+obj.RollNo);
        System.out.println("printing Section: "+obj.Section);
    }
}
